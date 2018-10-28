(function ($) {
    'use strict';
    if ($("#timepicker-example").length) {
        $('#timepicker-example').datetimepicker({
            format: 'LT',
            debug: true
        });
    }
    if ($(".color-picker").length) {
        $('.color-picker').asColorPicker();
    }
    if ($("#datepicker-popup").length) {
        $.fn.datepicker.defaults.format = "yyyy-mm-dd";
        $('#datepicker-popup').datepicker({
            format: 'yyyy-mm-dd',
            enableOnReadonly: true,
            todayHighlight: true,
        });
    }

    if ($("#inline-datepicker").length) {
        $('#inline-datepicker').datepicker({
            format: 'yyyy-mm-dd',
            enableOnReadonly: true,
            todayHighlight: true,
        });
    }
    if ($(".datepicker-autoclose").length) {
        $('.datepicker-autoclose').datepicker({
            autoclose: true
        });
    }
    if ($('input[name="date-range"]').length) {
        $('input[name="date-range"]').daterangepicker();
    }
    if ($('input[name="date-time-range"]').length) {
        $('input[name="date-time-range"]').daterangepicker({
            timePicker: true,
            timePickerIncrement: 30,
            locale: {
                format: 'yyyy-mm-dd h:mm A'
            }
        });
    }
})(jQuery);
