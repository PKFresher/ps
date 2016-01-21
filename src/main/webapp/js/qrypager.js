/**
 * Created by pengs01 on 2016/1/21.
 */

/*global jQuery, console*/
(function($) {
  'use strict';
   var btn = $('.confrim_btn');
    btn.click(function () {
        var key = $('#page_num').val();
        var href = $(this).attr('href');
        var index = href.lastIndexOf('-');
        var index2 = href.lastIndexOf('.html');
        var afterStr = href.substring(index2,href.length);
        href = href.substring(0, index + 1) + key + afterStr;
        window.location.href = href;
        return false;
    });
}(jQuery));
