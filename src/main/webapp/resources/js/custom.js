function ratePageByTour(id, page) {
    $.ajax({
        url: 'http://localhost:8080/api/' + id + '/rate/' + page,
        type: 'GET'
    })
        .done(function (data) {
            console.log("success");
            console.log(data);
            $('#tour-review .info-section h2 .ticket-title').val('Đánh giá (' + data[0].totalComment + ' Nhận xét)');
            $('#info-section .star-rating').attr('data-current-rating', data[0].totalRate);
            $('#user-review').empty();
            $.each(data, function (index, val) {
                $('#user-review').append(
                    '<div class="review-item">' +
                    '<div class="editer">' +
                    '<div class="editer-logo' + index + '"></div>' +
                    '</div>' +
                    '<div class="review-content">' +
                    '<h5 class="cfs-16">' + val.name + '</h5>' +
                    '<div class="product-star">' +
                    '<div class="row">' +
                    '<div class="col-lg-2">' +
                    '<select class="star-rating" name="rating" data-current-rating="' + val.star + '" style="float: right;">' +
                    '<option value="1">1</option>' +
                    '<option value="2">2</option>' +
                    '<option value="3">3</option>' +
                    '<option value="4">4</option>' +
                    '<option value="5">5</option>' +
                    '</select></div>' +
                    '<div class="col-lg-3">' +
                    '<span>' + val.updatedAt + '</span>' +
                    '</div></div></div>' +
                    '<p class="cfs-14">' + val.comment + '</p>' +
                    '</div></div>'
                );
                $('.editer-logo'+index).css();
            });

        })
        .fail(function () {
            console.log("error");
        })
}