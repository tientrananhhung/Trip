(function($) {
  'use strict';
    var drEvent = $('.dropify').dropify({});
    drEvent.on('dropify.error.fileExtension', function(event, element){
        alert('Image format error message!');
        $("#postsubmit").prop("disabled", true);
    });
    drEvent.on('dropify.error.imageFormat', function(event, element){
        alert('Image format error message!');
    });
})(jQuery);
