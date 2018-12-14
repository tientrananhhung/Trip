<%--
  Created by IntelliJ IDEA.
  User: tgdd
  Date: 27/10/2018
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>SmartTrip - Tour Manager</title>
    <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>"/>
    <!-- plugins:css -->
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/mdi/css/materialdesignicons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/flag-icon-css/css/flag-icon.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/perfect-scrollbar/css/perfect-scrollbar.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/font-awesome/css/font-awesome.min.css" />" />
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/dropify/dist/css/dropify.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/node_modules/codemirror/lib/codemirror.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_editor.pkgd.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/froala/froala_style.min.css"/>">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">

</head>
<body>
<div class="container-scroller">
    <jsp:include page="../include/nav-bar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <div class="row row-offcanvas row-offcanvas-right">
            <jsp:include page="../include/menu.jsp"/>
            <!-- partial -->
            <div class="content-wrapper">
                <div class="row">
                    <div class="col-md-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Manager Tour</h4>
                                <p class="card-description">
                                    Addition Tour
                                </p>
                                <hr/>
                                <f:form class="forms-sample"  method="POST" modelAttribute="tours"
                                        action="/admin/quan-ly-tour/${action}"  enctype="multipart/form-data">
                                        <f:hidden path="id"/>
                                    <div class="form-group">
                                        <label>Tour Name</label>
                                        <f:input type="text" cssClass="form-control"  path="name" placeholder="Name"/>
                                        <f:errors path="name" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Address</label>
                                        <f:input type="text" cssClass="form-control" path="address" placeholder="Address"/>
                                        <f:errors path="address" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Image</label>
                                        <f:input accept="image/*" path="fileData"
                                                 data-default-file="/resources/images/${posts.image}" type="file"
                                                 class="dropify" multiple="multiple"></f:input>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Content</label>
                                        <f:textarea type="text" cssClass="form-control" path="content" placeholder="Content"/>
                                        <f:errors path="content" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <div class="form-group">
                                        <label>Tour Policy</label>
                                        <f:input type="number" cssClass="form-control" path="policy" placeholder="Policy" />
                                        <f:errors path="policy" cssStyle="color:red;display:block"></f:errors>
                                    </div>
                                    <button type="submit" class="btn btn-success mr-2">Submit</button>
                                </f:form>
                                <a href="/admin/quan-ly-tour" class="btn btn-light">
                                    Cancel
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- content-wrapper ends -->
        <jsp:include page="../include/footer.jsp"/>
    </div>
</div>
</div>
<%-------js-css------%>
<script src="<c:url value="/resources/node_modules/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/popper.js/dist/umd/popper.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/dropify/dist/js/dropify.min.js" />"></script>
<script src="<c:url value="/resources/node_modules/moment/min/moment.min.js" />"></script>
<script src="<c:url value="/resources/js/off-canvas.js" />"></script>
<script src="<c:url value="/resources/js/hoverable-collapse.js" />"></script>
<script src="<c:url value="/resources/js/misc.js" />"></script>
<script src="<c:url value="/resources/js/settings.js" />"></script>
<script src="../../<c:url value="/resources/js/todolist.js" />"></script>
<script src="<c:url value="/resources/js/dropify.js"/>"></script>
<%--<script src="<c:url value="/resources/node_modules/codemirror/mode/xml/xml.js"/>"></script>--%>
<script src="<c:url value="/resources/node_modules/codemirror/lib/codemirror.js"/>"></script>
<script src="<c:url value="/resources/js/froala_editor.pkgd.min.js"/>"></script>
<script type="text/javascript" src="/resources/js/froala/vi.js"></script>
<script type="text/javascript" src="/resources/js/custom.js"></script>
<script> $(function () {
    $('textarea').froalaEditor()


}); </script>
<c:choose>
    <c:when test="${not empty tours}">
        <script>
            var address;

            function initAutocomplete() {

                var map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: ${tours.lat}, lng: ${tours.lng}},
                    zoom: 15,
                    mapTypeId: 'roadmap'
                });

                // Create the search box and link it to the UI element.
                var input = document.getElementById('pac-input');
                address = input;

                var searchBox = new google.maps.places.SearchBox(input);
                map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

                // Bias the SearchBox results towards current map's viewport.
                map.addListener('bounds_changed', function() {
                    searchBox.setBounds(map.getBounds());
                });

                var markers = [];

                <c:forEach items="${listTour}" var="lTour" begin="0" end="0">
                markers.push(new google.maps.Marker({
                    map: map,
                    title: 'Bạn đang ở ${lTour.name}',
                    position: myLatlng
                }));
                </c:forEach>

                // Listen for the event fired when the user selects a prediction and retrieve
                // more details for that place.
                searchBox.addListener('places_changed', function() {
                    var places = searchBox.getPlaces();

                    if (places.length == 0) {
                        return;
                    }

                    // Clear out the old markers.
                    markers.forEach(function(marker) {
                        marker.setMap(null);
                    });
                    markers = [];

                    // For each place, get the icon, name and location.
                    var bounds = new google.maps.LatLngBounds();

                    places.forEach(function(place) {
                        if (!place.geometry) {
                            return;
                        }

                        // Create a marker for each place.
                        markers.push(new google.maps.Marker({
                            map: map,
                            title: place.name,
                            position: place.geometry.location
                        }));

                        if (place.geometry.viewport) {
                            // Only geocodes have viewport.
                            bounds.union(place.geometry.viewport);
                        } else {
                            bounds.extend(place.geometry.location);
                        }

                        var getlatlng = place.geometry.location;

                        $.ajax({
                            url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+getlatlng.lat()+','+getlatlng.lng()+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                            type: 'GET'
                        })
                            .done(function(data) {
                                $('#lat').val(getlatlng.lat());
                                $('#lng').val(getlatlng.lng());
                                $('.address-tour').children('b').html(data.results[0].formatted_address);
                            })
                            .fail(function() {
                                console.log("error");
                            })

                    });
                    map.fitBounds(bounds);
                });
            }
        </script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk&libraries=places&callback=initAutocomplete"
                async defer></script>
    </c:when>
    <c:otherwise>
        <script>

            if (navigator && navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(initAutocomplete, errorCallback);
            } else {
                console.log('Geolocation is not supported');
            }

            function errorCallback() {

                var myLatlng = new google.maps.LatLng(16.075733, 108.16994899999997);

                var map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: 16.075733, lng: 108.16994899999997},
                    zoom: 13,
                    mapTypeId: 'roadmap'
                });

                var markers = [];

                markers.push(new google.maps.Marker({
                    map: map,
                    title: 'Bạn đang ở đây',
                    position: myLatlng
                }));

                $.ajax({
                    url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+16.075733+','+108.16994899999997+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                    type: 'GET'
                })
                    .done(function(data) {
                        $('#lat').val(16.075733);
                        $('#lng').val(108.16994899999997);
                    })
                    .fail(function() {
                        console.log("error");
                    })

                // Create the search box and link it to the UI element.
                var input = document.getElementById('pac-input');
                address = input;

                var searchBox = new google.maps.places.SearchBox(input);
                map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

                // Bias the SearchBox results towards current map's viewport.
                map.addListener('bounds_changed', function() {
                    searchBox.setBounds(map.getBounds());
                });

                // Listen for the event fired when the user selects a prediction and retrieve
                // more details for that place.
                searchBox.addListener('places_changed', function() {
                    var places = searchBox.getPlaces();

                    console.log(places);

                    if (places.length == 0) {
                        return;
                    }

                    // Clear out the old markers.
                    markers.forEach(function(marker) {
                        marker.setMap(null);
                    });
                    markers = [];

                    // For each place, get the icon, name and location.
                    var bounds = new google.maps.LatLngBounds();

                    places.forEach(function(place) {
                        if (!place.geometry) {
                            return;
                        }

                        // Create a marker for each place.
                        markers.push(new google.maps.Marker({
                            map: map,
                            title: place.name,
                            position: place.geometry.location
                        }));

                        if (place.geometry.viewport) {
                            // Only geocodes have viewport.
                            bounds.union(place.geometry.viewport);
                        } else {
                            bounds.extend(place.geometry.location);
                        }

                        var getlatlng = place.geometry.location;

                        $.ajax({
                            url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+getlatlng.lat()+','+getlatlng.lng()+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                            type: 'GET'
                        })
                            .done(function(data) {
                                $('#lat').val(getlatlng.lat());
                                $('#lng').val(getlatlng.lng());
                                $('.address-tour').children('b').html(data.results[0].formatted_address);
                            })
                            .fail(function() {
                                console.log("error");
                            })

                    });
                    map.fitBounds(bounds);
                });
            }

            // Gmap
            function initAutocomplete(position) {

                var myLatlng = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);

                var map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: position.coords.latitude, lng: position.coords.longitude},
                    zoom: 13,
                    mapTypeId: 'roadmap'
                });

                var markers = [];

                markers.push(new google.maps.Marker({
                    map: map,
                    title: 'Bạn đang ở đây',
                    position: myLatlng
                }));

                $.ajax({
                    url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+position.coords.latitude+','+position.coords.longitude+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                    type: 'GET'
                })
                    .done(function(data) {
                        $('#lat').val(position.coords.latitude);
                        $('#lng').val(position.coords.longitude);
                        $('.address-tour').children('b').html(data.results[0].formatted_address);
                    })
                    .fail(function() {
                        console.log("error");
                    })

                // Create the search box and link it to the UI element.
                var input = document.getElementById('pac-input');
                address = input;

                var searchBox = new google.maps.places.SearchBox(input);
                map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);

                // Bias the SearchBox results towards current map's viewport.
                map.addListener('bounds_changed', function() {
                    searchBox.setBounds(map.getBounds());
                });

                // Listen for the event fired when the user selects a prediction and retrieve
                // more details for that place.
                searchBox.addListener('places_changed', function() {
                    var places = searchBox.getPlaces();

                    console.log(places);

                    if (places.length == 0) {
                        return;
                    }

                    // Clear out the old markers.
                    markers.forEach(function(marker) {
                        marker.setMap(null);
                    });
                    markers = [];

                    // For each place, get the icon, name and location.
                    var bounds = new google.maps.LatLngBounds();

                    places.forEach(function(place) {
                        if (!place.geometry) {
                            return;
                        }

                        // Create a marker for each place.
                        markers.push(new google.maps.Marker({
                            map: map,
                            title: place.name,
                            position: place.geometry.location
                        }));

                        if (place.geometry.viewport) {
                            // Only geocodes have viewport.
                            bounds.union(place.geometry.viewport);
                        } else {
                            bounds.extend(place.geometry.location);
                        }

                        var getlatlng = place.geometry.location;

                        $.ajax({
                            url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+getlatlng.lat()+','+getlatlng.lng()+'&key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk',
                            type: 'GET'
                        })
                            .done(function(data) {
                                $('#lat').val(getlatlng.lat());
                                $('#lng').val(getlatlng.lng());
                                $('.address-tour').children('b').html(data.results[0].formatted_address);
                            })
                            .fail(function() {
                                console.log("error");
                            })

                    });
                    map.fitBounds(bounds);
                });
            }
        </script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDawMp3IadhGe1AbQgDXGZM4CHfqDCNRYk&libraries=places"
                async defer></script>
    </c:otherwise>
</c:choose>
</body>
</html>
