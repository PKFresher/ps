/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2015-05-06 13:42:32
 * @version $Id$
 */

/*$(function(){

	$('.city_down').hover(function(){
		$('.city_select_box').show();
		$(this).css('border-bottom','0');
		$(this).children('p').children('i').removeClass('icon-down').addClass('icon-up');
	},function(){
		$('.city_select_box').hide();
		$(this).css('border-bottom','1px solid #e9e9e9');
		$(this).children('p').children('i').removeClass('icon-up').addClass('icon-down');
	});
	
	$('.tabArea').each(function(){
		$(this).tabBlock({
			hd:$(this).find('.tabhd'),
			bd:$(this).find('.tabbd')
		});
	}); 

	$('.crumb_search input').focus(function(){
		$(this).css('border','1px solid #c7003a');
		$(this).next('a').css('color','#c7003a');
	}).blur(function(){
		$(this).css('border','1px solid #c7c7c7');
		$(this).next('a').css('color','#999');
	});

	
	$('.product_list li').each(function(i){
		if(i%5==4){
			$(this).css('margin-right','0');
		}
	});

	
	$('.screen_content:last').css('border-bottom','0');

	
	$('#brand dd a').each(function(i){
		if(i>5){
			$(this).hide();
		}
	});
   
    $('#brand_box').each(function(){
       var Lh = $(this).children('.screen_content_right').height();
       $(this).children('.screen_content_left').height(Lh);
    });

	$('.more_brand').click(function(){
		var $a = $('#brand dd a');
		if($a.is(':hidden')){
			$('#brand dd a').each(function(i){
				if(i>5){
					$(this).show();
					var b_height = $('#brand').parent('.screen_content_right').height();
					$('#brand').parent('.screen_content_right').siblings('.screen_content_left').height(b_height);
					$('.more_brand').find('span').text('鏀惰捣');
					$('.more_brand').find('i').removeClass('icon-down').addClass('icon-up');
				}
			});
		}else{
			$('#brand dd a').each(function(i){
				if(i>5){
					$(this).hide();
					var b_height = $('#brand').parent('.screen_content_right').height();
					$('#brand').parent('.screen_content_right').siblings('.screen_content_left').height(b_height);
					$('.more_brand').find('span').text('鏇村');
					$('.more_brand').find('i').removeClass('icon-up').addClass('icon-down');
				}
			});
		}
		
	});

	
	var s_Counter =0;
	$('.screen_category a').click(function(c){
		s_Counter = s_Counter+1;
		var _Html = $(this).text();
		var b_html = $(this).parents('.screen_content').find('.screen_content_left').children('span').text();
		$('.crumb_screening').append("<a href='javascript:;'><b></b><em></em><i class='icon-font icon-close'></i></a>");
		$('.crumb_screening a').eq(s_Counter-1).children('b').text(b_html);
		$('.crumb_screening a').eq(s_Counter-1).children('em').text(_Html);
		$(this).parents('.screen_content').hide();
		if(s_Counter<2){
			$('.crumb_screening').after('<span>&gt;</span>')
		}
		if(s_Counter==5){
			$('.screen_box').hide();
		}
        var $length = $(this).parents('.screen_content').length;
        //alert($length);
        if($length==1){
            $('.screen_box').hide();
        }

		$('.crumb_screening a').click(function() {
			var b_text = $(this).children('b').text();
			$(this).remove();
			var d_Counter = $('.crumb_screening a').length;
			s_Counter = d_Counter;
			$('.screen_box').show();
			$('.screen_content').each(function(){
				var sb_text = $(this).children('.screen_content_left').find('span').text();
				if(b_text == sb_text){
					$(this).show();
				}
			});
			if(d_Counter==0){
				$('.crumb_screening').next('span').remove();
			}
			return s_Counter;

		});
	});
	

	
	$('.city_list dt').click(function(){
		var city_html = $(this).text();
		var _city = $(this).parent('dl').clone();
		var curNum = $(this).parents('.item').index();
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).children('span').text(city_html);
		$(this).parents('.item').next().html(_city).find('dd').show();
		$(this).parents('.item').next().find('dt').hide();
		$(this).parents('.item').hide().next().show();
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).removeClass('cur');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).children('i').removeClass('icon-up').addClass('icon-down');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).siblings().show().addClass('cur');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).siblings().children('i').removeClass('icon-down').addClass('icon-up');


		$('.city_list dd').click(function(){
			var _city_html = $(this).children('a').text();
			var _curNum = $(this).parents('.item').index();
			$('.city_select_box .tabArea .tabhd ul li').eq(_curNum).children('span').text(_city_html);

			var c_one = $('.city_select_box .tabArea .tabhd ul li').text();
			//$('#city').children('span').text(c_one)

			if(_curNum > 0){
				$('#city').children('span').text(c_one);
			}
		});

		$('.city_select_box .tabArea .tabhd ul li').click(function(){
			var _index = $(this).index();
			if(_index < 1){
				$(this).siblings().children('span').text('璇烽�鎷�);
				$(this).siblings().css('display','none');
			}
		});

		
		
	});

    
    $('.sort_list li a').click(function(){
       $(this).addClass('cur');
        $(this).parent('li').siblings().children('a').removeClass('cur');
    });

})*/

.fn ({
	tabBlock : function(info){
		var init = {after : function(){},before : function(){}};
		var obj = info;
		obj.after = obj.after || init.after;
		obj.before = obj.before || init.before;
		obj.bd.find('div.item').eq(0).show().siblings().hide();
		obj.hd.find('li').eq(0).addClass("cur").siblings().removeClass("cur");
		obj.hd.find('li').eq(0).addClass("cur").children('i').removeClass("icon-down").addClass('icon-up');/*閽堝绗竴涓爣绛惧皷澶村垏鎹�/
		obj.hd.find('li').on('click',function(){
			$(this).addClass('cur').siblings().removeClass('cur');
			$(this).addClass('cur').children('i').removeClass("icon-down").addClass('icon-up');/*閽堝灏栧ご涓婁笅鍒囨崲*/
			$(this).addClass('cur').siblings().children('i').removeClass('icon-up').addClass('icon-down');/*閽堝灏栧ご涓婁笅鍒囨崲*/
			var curNum = $(this).parent().find('li').index(this);
			obj.bd.find('div.item').eq(curNum).show().siblings().hide();
			obj.after($(this),$(this).index());
			return false;
		});
	}
});


$(function() {
	$('.city_down').hover(function(){
		$('.city_select_box').show();
		$(this).css('border-bottom','0');
		$(this).children('p').children('i').removeClass('icon-down').addClass('icon-up');
	},function(){
		$('.city_select_box').hide();
		$(this).css('border-bottom','1px solid #e9e9e9');
		$(this).children('p').children('i').removeClass('icon-up').addClass('icon-down');
	});

	$('.tabArea').each(function(){
		$(this).tabBlock({
			hd:$(this).find('.tabhd'),
			bd:$(this).find('.tabbd')
		});
	});

    //	/*鍩庡競*/
	$('.city_list dt').click(function(){
		var city_html = $(this).text();
		var _city = $(this).parent('dl').clone();
		var curNum = $(this).parents('.item').index();
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).children('span').text(city_html);
		$(this).parents('.item').next().html(_city).find('dd').show();
		$(this).parents('.item').next().find('dt').hide();
		$(this).parents('.item').hide().next().show();
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).removeClass('cur');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).children('i').removeClass('icon-up').addClass('icon-down');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).siblings().show().addClass('cur');
		$('.city_select_box .tabArea .tabhd ul li').eq(curNum).siblings().children('i').removeClass('icon-down').addClass('icon-up');


		$('.city_list dd').click(function(){
			var _city_html = $(this).children('a').text();
			var _curNum = $(this).parents('.item').index();
			$('.city_select_box .tabArea .tabhd ul li').eq(_curNum).children('span').text(_city_html);

			var c_one = $('.city_select_box .tabArea .tabhd ul li').text();
			//$('#city').children('span').text(c_one)

			if(_curNum > 0){
				$('#city').children('span').text(c_one);
			}
		});

		$('.city_select_box .tabArea .tabhd ul li').click(function(){
			var _index = $(this).index();
			if(_index < 1){
				$(this).siblings().children('span').text('璇烽�鎷�);
				$(this).siblings().css('display','none');
			}
		});
	});

    //    /*鎺掑簭*/
    $('.sort_list li a').click(function(){
       $(this).addClass('cur');
        $(this).parent('li').siblings().children('a').removeClass('cur');
    });
});


/*Edit by DaFei for date 05/05/08*/
;(function($) {
    'use strict';
    var FILTER = {
        init: function () {
            this.domElem();
            this.events();
            this.getHeight();
        },
        domElem: function () {
            this.self = $('.screen_box');
            this.screenContent = this.self.find('.screen_content');
            this.screenContentLeft = this.self.find('.screen_content_left');
            this.screenContentRight = this.self.find('.screen_content_right');
        },
        events: function () {
            var that = this;

            //  remove screen content(last-child) borer-bottom.
            that.screenContent.eq(-1).css({
                'border': 'none'
            });

            .each(that, function(index, elem) {
//                var item = $(this).find('dd a:gt(8)');
                var toggleBtn = $(this).find('.more_brand');

//                item.hide();

                //  鍒濆鑾峰彇楂樺害
//                toggleBtn.click(function() {
//                    if (item.is(':visible')) {
//                    	that.screenContentRight.css({
//                    		'height': '22px'
//                    	});
//                        item.hide();
//                        $(this).find('span').text('鏇村');
//                        that.getHeight();
//                    } else {
//                    	that.screenContentRight.css({
//                    		'height': 'auto'
//                    	});
//                        item.css({
//                            'display': 'inline-block'
//                        });
//                        $(this).find('span').text('鏀惰捣');
//                        that.getHeight();
//                    }
//
//                });
                
                toggleBtn.click(function() {
                	that.screenContentRight.toggleClass('height-auto');
                	if (that.screenContentRight.hasClass('height-auto')) {
                		$(this).find('span').text('鏀惰捣');
                		that.getHeight();
                	} else {
                		$(this).find('span').text('鏇村');
                		that.getHeight();
                	}
                });
            });
        },
        getHeight: function () {
            var that = this;

            .each(that, function(index, elem) {
                $(this).css({
                    'height': that.screenContentRight.eq(index).outerHeight()
                });
            });
        }
    };

    FILTER.init();
    
    $("img.lazy").lazyload();
}(jQuery));