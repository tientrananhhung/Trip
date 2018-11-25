function ratePageByTour(id, page) {
    $.ajax({
        url: 'http://localhost:8080/api/' + id + '/rate/' + page,
        type: 'GET'
    })
        .done(function (data) {
            if (typeof data !== 'undefined' && data.length > 0) {

                $('.btn-next').attr({
                    'current-page': page,
                    'final-page': data[0].totalPage - 1
                });
                $('.btn-back').attr('current-page', page);

                $('#tour-review .info-section .ticket-title').html('Đánh giá (' + data[0].totalComment + ' Nhận xét)');
                $('.info-section .star-rating').attr('data-current-rating', data[0].totalRate);
                $('#star-rating').barrating({
                    theme: 'fontawesome-stars-o',
                    readonly: true,
                    initialRating: data[0].totalRate
                });

                loadComment(data);

            } else {
                $('#tour-review .info-section .ticket-title').html('Tour du lịch này chưa có đánh giá.');
                $('.info-section .star-rating').attr('data-current-rating', 0);
                $('#star-rating').barrating({
                    theme: 'fontawesome-stars-o',
                    readonly: true,
                    initialRating: 0
                });
                $('#user-review').empty();
                $('#tour-review .center').empty();
            }

        })
        .fail(function () {
            console.log("error");
        })
}

function loadComment(data) {
    $('#user-review').empty();
    $.each(data, function (index, val) {
        var a = '.logo-user' + index;
        var b = '#star-rating' + index;
        $('#user-review').append(
            '<div class="review-item">' +
            '<div class="editer">' +
            '<div class="editer-logo logo-user' + index + '"></div>' +
            '</div>' +
            '<div class="review-content">' +
            '<h5 class="cfs-16">' + val.name + '</h5>' +
            '<div class="product-star">' +
            '<div class="row">' +
            '<div class="col-lg-2">' +
            '<select id="star-rating' + index + '" class="star-rating" name="rating" data-current-rating="' + val.star + '" style="float: right;">' +
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

        //Set avatar for user
        $(a).css('background-image', 'url(/resources/images/avatar.png)');

        //Set rating for page
        var currentRating = $(b).data('current-rating');
        $(b).barrating({
            theme: 'fontawesome-stars-o',
            readonly: true,
            initialRating: currentRating
        });

    });
}

function loadPaging(id) {
    $.ajax({
        url: 'http://localhost:8080/api/' + id + '/rate/0',
        type: 'GET'
    })
        .done(function (data) {

            if (data[0].totalPage == 1) {
                //Add paging
                $('#tour-review .pagination').empty();
                $('#tour-review .pagination').append(
                    '<li class="page-item disabled">' +
                    '<a class="page-link btn-back" href="#">' +
                    '<i class="fa fa-angle-left" aria-hidden="true"></i></a></li>' +
                    '<li class="page-item active"><a class="page-link btn-page" href="#">1</a></li>' +
                    '<li class="page-item disabled">' +
                    '<a class="page-link btn-next" href="#">' +
                    '<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>'
                );
            } else {
                $('#tour-review .pagination').empty();
                $('#tour-review .pagination').append(
                    '<li class="page-item disabled">' +
                    '<a class="page-link btn-back" current-page="0" href="#">' +
                    '<i class="fa fa-angle-left" aria-hidden="true"></i></a></li>'
                );

                for (var j = 0; j < data[0].totalPage; j++) {
                    if (j == 0) {
                        $('#tour-review .pagination').append(
                            '<li class="page-item active"><a class="page-link btn-page" page="' + j + '" href="#">' + (j + 1) + '</a></li>'
                        );
                    } else {
                        $('#tour-review .pagination').append(
                            '<li class="page-item"><a class="page-link btn-page" page="' + j + '" href="#">' + (j + 1) + '</a></li>'
                        );
                    }
                }

                $('#tour-review .pagination').append(
                    '<li class="page-item">' +
                    '<a class="page-link btn-next" current-page="0" href="#">' +
                    '<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>'
                );
            }
        })
        .fail(function () {
            console.log("error");
        })
}

function setOrder(data) {
    // body...
    $('.book-package-person').empty();
    var total = 0;
    $.each(data, function (index, val) {
        /* iterate through array or object */
        var service = val.children[0].children[0].innerHTML;
        var price = val.children[0].children[2].defaultValue;
        var quantity = val.children[1].children[0].children[0].children[0].children[0].children[0].children[0].children[1].innerHTML;
        total = parseInt(total) + (parseInt(price) * parseInt(quantity));
        if (parseInt(quantity) != 0) {
            $('.book-package-person').append(
                '<div class="mg-bottom-10">' +
                '<div class="row">' +
                '<div class="col-lg-6">' + service + '</div>' +
                '<div class="col-lg-2 center">x' + quantity + '</div>' +
                '<div class="col-lg-4">' +
                '<div class="t_right">' +
                formatNumber(price, '.', '.') + ' ₫' +
                '<input class="order-val" type="hidden" priceticket="' + price + '" nameticket="' + service + '" quantityticket="' + quantity + '" />' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>'
            );
            $('#total-price-service').html(formatNumber(total, '.', '.') + " đ");
            $('#total-price-service').next().val(total);
        }
    });
    if (parseInt(total) == 0) {
        $('#total-price-service').html("0 đ");
        $('#total-price-service').next().val(0);
    }
}

function formatNumber(nStr, decSeperate, groupSeperate) {
    nStr += '';
    x = nStr.split(decSeperate);
    x1 = x[0];
    x2 = x.length > 1 ? '.' + x[1] : '';
    var rgx = /(\d+)(\d{3})/;
    while (rgx.test(x1)) {
        x1 = x1.replace(rgx, '$1' + groupSeperate + '$2');
    }
    return x1 + x2;
}

function resetBtnChooseTicket() {
    // body...
    $('.ticket-package-detail').removeClass('ticket-selected');
    $('.btn-choose-ticket').css('display', 'inherit');
    $('.package-kind-ticket').css('display', 'none');
    $('.notify-ticket').css('display', 'none');
    $('.val-ticket').html(0);
    $('#total-price-service').html('0 đ');
    $('#total-price-service').next().val(0);
    $('.book-package-person').empty();
    $('#card-text-order').hide(500);
    $('#card-order').show(500);
}