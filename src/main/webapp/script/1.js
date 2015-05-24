/**
 * User: changejava
 * Date: 2015/4/15
 * Time: 21:58
 */
!function (require, undefined) {
  define("order", function () {
    var baseUrl = "http://order.b5m.com", OrderView = {
      Views: {
        ajaxSubmit: function (e, r, t) {
          var o = {url: "", type: "GET", json: "", dataType: "json", jsonp: "jsonpCallback", async: !0};
          return $.isFunction(r) ? ($.extend(o, e), $.ajax({
            url: o.url, type: o.type, data: o.json, dataType: o.dataType, jsonp: o.jsonp, async: o.async, timeout: 3e4, cache: !1, headers: {Accept: "application/json; charset=utf-8", "Content-Type": "application/json; charset=utf-8"}, success: r, error: function (e, r) {
              return $.isFunction(t) ? t() : console.log("timeout" == r ? "请求超时！" : "请求失败，请重试！" + o.url), !1
            }
          }), !0) : !1
        }, formatTime: function (e, r) {
          var t = function (e, r) {
            return (e += "").length < r ? new Array(++r - e.length).join("0") + e : e
          }, o = function (e, r) {
            var a = r ? new Date(1e3 * r) : new Date, d = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"], s = {1: "st", 2: "nd", 3: "rd", 21: "st", 22: "nd", 23: "rd", 31: "st"}, i = ["", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"], l = {
              d: function () {
                return t(l.j(), 2)
              }, D: function () {
                return l.l().substr(0, 3)
              }, j: function () {
                return a.getDate()
              }, l: function () {
                return d[l.w()]
              }, N: function () {
                return l.w() + 1
              }, S: function () {
                return s[l.j()] ? s[l.j()] : "th"
              }, w: function () {
                return a.getDay()
              }, z: function () {
                return (a - new Date(a.getFullYear() + "/1/1")) / 864e5 >> 0
              }, W: function () {
                var e, r = l.z(), t = 364 + l.L() - r, d = (new Date(a.getFullYear() + "/1/1").getDay() || 7) - 1;
                return 2 >= t && (a.getDay() || 7) - 1 <= 2 - t ? 1 : 2 >= r && d >= 4 && r >= 6 - d ? (e = new Date(a.getFullYear() - 1 + "/12/31"), o("W", Math.round(e.getTime() / 1e3))) : 1 + (3 >= d ? (r + d) / 7 : (r - (7 - d)) / 7) >> 0
              }, F: function () {
                return i[l.n()]
              }, m: function () {
                return t(l.n(), 2)
              }, M: function () {
                return l.F().substr(0, 3)
              }, n: function () {
                return a.getMonth() + 1
              }, t: function () {
                var e;
                return 2 == (e = a.getMonth() + 1) ? 28 + l.L() : 1 & e && 8 > e || !(1 & e) && e > 7 ? 31 : 30
              }, L: function () {
                var e = l.Y();
                return 3 & e || !(e % 100) && e % 400 ? 0 : 1
              }, Y: function () {
                return a.getFullYear()
              }, y: function () {
                return (a.getFullYear() + "").slice(2)
              }, a: function () {
                return a.getHours() > 11 ? "pm" : "am"
              }, A: function () {
                return l.a().toUpperCase()
              }, B: function () {
                var e = 60 * (a.getTimezoneOffset() + 60), r = 3600 * a.getHours() + 60 * a.getMinutes() + a.getSeconds() + e, t = Math.floor(r / 86.4);
                return t > 1e3 && (t -= 1e3), 0 > t && (t += 1e3), 1 == String(t).length && (t = "00" + t), 2 == String(t).length && (t = "0" + t), t
              }, g: function () {
                return a.getHours() % 12 || 12
              }, G: function () {
                return a.getHours()
              }, h: function () {
                return t(l.g(), 2)
              }, H: function () {
                return t(a.getHours(), 2)
              }, i: function () {
                return t(a.getMinutes(), 2)
              }, s: function () {
                return t(a.getSeconds(), 2)
              }, O: function () {
                var e = t(Math.abs(a.getTimezoneOffset() / 60 * 100), 4);
                return e = a.getTimezoneOffset() > 0 ? "-" + e : "+" + e
              }, P: function () {
                var e = l.O();
                return e.substr(0, 3) + ":" + e.substr(3, 2)
              }, c: function () {
                return l.Y() + "-" + l.m() + "-" + l.d() + "T" + l.h() + ":" + l.i() + ":" + l.s() + l.P()
              }, U: function () {
                return Math.round(a.getTime() / 1e3)
              }
            };
            return e.replace(/[\\]?([a-zA-Z])/g, function (e, r) {
              var t = "";
              return t = e != r ? r : l[r] ? l[r]() : r
            })
          };
          return o(e, r)
        }
      },
      Urls: {
        FiltOrderUrl: baseUrl + "/dh/bang5mai/order/goods/status/all/count.htm?jsonpCallback=?",
        LocationUrl: B5M_UC.rootPath + "/trade/myorder.htm",
        goodsStatus: baseUrl + "/dh/bang5mai/order/goods/status.htm?jsonpCallback=?",
        delOrder: baseUrl + "/dh/bang5mai/order/goods/deleteGoodsOrder.htm?jsonpCallback=?",
        cancelOrder: baseUrl + "/dh/order/group/cancel.htm?jsonpCallback=?",
        optGoodsStatus: baseUrl + "/dh/bang5mai/order/goods/status/operation.htm?jsonpCallback=?",
        orderListById: baseUrl + "/dh/bang5mai/order/goods/findOrderGoodsByUserId.htm",
        orderListByAct: baseUrl + "/dh/bang5mai/order/findOrderWithGoodsIncAct.htm",
        orderList: baseUrl + "/dh/order/group/page.htm",
        orderCeil: baseUrl + "/dh/bang5mai/order/goods/findPage.htm"
      },
      userId: Cookies.get("token")
    }, root = OrderView.Views;
    return OrderView.Views.OrderFiltView = {
      initialize: function (e) {
        root.$orderClist = $(e.el).find(".order-clist"), root.$orderFilter = $(e.el).find(".order-filter"), root.showStatus = ["", "100", "200", "300"], root.stTime = root.OrderFiltView.GetQueryString("stTime"), root.endTime = root.OrderFiltView.GetQueryString("endTime"), root.orderStatus = root.OrderFiltView.GetQueryString("orderStatus"), root.searchKey = root.OrderFiltView.GetQueryString("search"), root.listType = root.OrderFiltView.GetQueryString("listType") || 0, root.$orderClist.children().each(function (e) {
          $(this).data("data-status", root.showStatus[e])
        }), root.isSearch = !1, root.OrderFiltView.showOrderStatus(), root.OrderFiltView.searchOrderInit()
      }, GetQueryString: function (e) {
        var r = new RegExp("(^|&)" + e + "=([^&]*)(&|$)"), t = window.location.search.substr(1).match(r);
        return null != t ? unescape(t[2]) : ""
      }, searchOrderInit: function () {
        root.$orderFilter.on("click", ".search-btn", root.OrderFiltView.searchOrderHandler), root.$orderFilter.on("keydown", ".search-text", root.OrderFiltView.searchOrderHandler), "" != root.searchKey && (root.isSearch = !0)
      }, searchOrderHandler: function (e) {
        ("keydown" != e.type || 13 == e.keyCode) && root.OrderFiltView.searchValid() && root.OrderFiltView.doSearch()
      }, doSearch: function () {
        root.isSearch = !0, root.OrderFiltView.refreshHtml()
      }, searchValid: function () {
        var e = root.$orderFilter.find(".search-text"), r = $.trim(e.val());
        return "" == r ? !1 : (root.searchKey = r, !0)
      }, showOrderStatus: function () {
        $.getJSON(OrderView.Urls.FiltOrderUrl, {userId: OrderView.userId}, function (e) {
          e.ok && (root.$orderClist.children().each(function (r) {
            r > 0 && $(this).find("em").html(0 != e.data[$(this).data("data-status")] ? e.data[$(this).data("data-status")] : ""), r == parseInt(root.listType) && $(this).addClass("now")
          }), root.$orderClist.on("click", ".order-cbox", function (e) {
            root.$orderClist.children().eq(root.listType).removeClass("now"), root.listType = root.$orderClist.children().index($(e.currentTarget)), root.$orderClist.children().eq(root.listType).addClass("now"), root.OrderFiltView.isShowOrderFilt(!1), root.OrderFiltView.fastConditions($(this))
          }))
        }), root.OrderFiltView.isShowOrderFilt(!0)
      }, isShowOrderFilt: function (e) {
        0 == parseInt(root.listType) ? (e && root.OrderFiltView.getOrderFiltHtml(), root.$orderFilter.show()) : root.$orderFilter.hide()
      }, getOrderFiltHtml: function () {
        var e = (new Date).getFullYear();
        root.trunTime = [e, e - 1, e - 2, e - 3, e - 4];
        for (var r = "", t = 0; t < root.trunTime.length; t++)r += 0 == t ? "<option value='" + (t + 1) + "'>今年内</option>" : t == root.trunTime.length - 1 ? "<option value='" + (t + 1) + "'>" + (root.trunTime[t] + 1) + "以前</option>" : "<option value='" + (t + 1) + "'>" + root.trunTime[t] + "</option>";
        if (root.$orderFilter.find(".filter-ctime").find("select").append(r), "" == root.stTime)root.$orderFilter.find(".filter-ctime").find("select option:eq(0)").attr("selected", !0); else if ("" != root.stTime) {
          var o = root.trunTime.indexOf(parseInt(root.stTime.match(/\d{4}(?=-)/g)));
          o >= 0 && root.$orderFilter.find(".filter-ctime").find("select option:eq(" + (o + 1) + ")").attr("selected", !0)
        }
        root.$orderFilter.find(".filter-status").find("select option[value='" + root.orderStatus + "']").attr("selected", !0), root.$orderFilter.find("select").selectOrDie({
          onChange: function () {
            $(this).closest(".filter-ctime").length ? root.OrderFiltView.changeTime($(this)) : $(this).closest(".filter-status").length && root.OrderFiltView.changeStatus($(this))
          }
        })
      }, changeTime: function (e) {
        var r = e, t = r.find("option:selected")[0].index;
        0 == t ? root.stTime = root.endTime = "" : (root.stTime = root.trunTime[t - 1] + "-01-01 00:00:00", root.endTime = root.trunTime[t - 2] ? root.trunTime[t - 2] + "-01-01 00:00:00" : ""), root.listType = 0, root.isSearch = !1, root.OrderFiltView.refreshHtml()
      }, changeStatus: function (e) {
        var r = e;
        root.orderStatus = r.val(), root.listType = 0, root.isSearch = !1, root.OrderFiltView.refreshHtml()
      }, fastConditions: function (e) {
        root.stTime = "", root.endTime = "", root.isSearch = !1, root.orderStatus = e.data("data-status"), root.OrderFiltView.refreshHtml()
      }, refreshHtml: function () {
        root.isSearch || (root.searchKey = ""), root.OrderListView.render()
      }
    }, OrderView.Views.OrderListView = {
      initialize: function (e) {
        root.$orderList = $(e.el), root.OrderListView.render(), root.$orderList.on("click", "a.delete", root.OrderListView.deleteOrderHandler), root.$orderList.on("click", "a.cancel", root.OrderListView.cancelOrderHandler), root.$orderList.on("click", "a.confirm", root.OrderListView.confirmOrderHandler), $(".dialog-delete-order").on("click", ".confirm,.cancel", function (e) {
          var r = $(e.target), t = r.closest(".dialog-delete-order");
          "confirm" == e.target.className && root.ajaxSubmit({url: OrderView.Urls.delOrder, json: {orderNum: root.$order_operate.data("lbtr-ordernum")}, dataType: "json", async: !1}, function (e) {
            if (e.ok) {
              var r = root.parameterData.pageNum;
              1 == root.orderDataList.all.length && r > 1 && (r -= 1), root.OrderListView.render({pageNum: r})
            }
          }), t.window("close")
        }).window({id: "dialog-delete", title: "您确定要删除该订单吗？"}), $(".dialog-cancel-order").on("click", ".confirm,.cancel", function (e) {
          var r = $(e.target), t = r.closest(".dialog-cancel-order");
          if ("confirm" == e.target.className) {
            var o = "";
            o = t.find(".otherReason textarea").is(":visible") ? "" != t.find(".otherReason textarea").val() ? t.find(".otherReason textarea").val() : "其他" : t.find("select").val(), jsonData = {groupId: root.$order_operate.data("lbtr-ordernum"), userId: OrderView.userId, reason: o}, "" !== $.trim(o) && null !== $.trim(o) && (root.ajaxSubmit({url: OrderView.Urls.cancelOrder, json: jsonData, dataType: "json", async: !1}, function (e) {
              e.ok && (root.$order_status.html("--"), root.$order_operate.html("--"), root.$order_group.find("tbody td.order-status").html("交易关闭"), root.$order_group.find("tbody td.order-operate").empty().html(function () {
                var e = "";
                return e += '<a href="' + B5M_UC.rootPath + "/forward.htm?method=/user/trade/korea/goodsDetail&orderNum=" + $(this).data("lbtr-ordernum") + '" class="order-handle" target="_blank">查看详情</a>', e += '<a href="javascript:void(0);" class="order-handle delete">删除</a>'
              }))
            }), t.window("close"))
          } else t.window("close")
        }).window({id: "dialog-cancel", title: "提示："}), $(".dialog-cancel-order").find("select").selectOrDie({
          customClass: "custom", onChange: function () {
            var e = this.selectedIndex;
            e == this.length - 1 ? $(this).closest(".msg-section").find(".otherReason").on("keyup", "textarea", function () {
              $(this).val().length > 200 && $(this).val($(this).val().substr(0, 200))
            }).show() : $(this).closest(".msg-section").find(".otherReason").hide()
          }
        }), $(".dialog-confirm-order").on("click", ".confirm,.cancel", function (e) {
          var r = $(e.target), t = r.closest(".dialog-confirm-order");
          "confirm" == e.target.className && root.ajaxSubmit({url: OrderView.Urls.optGoodsStatus, json: {orderNum: root.$order_operate.data("lbtr-ordernum"), status: 304}, dataType: "jsonp", async: !1}, function (e) {
            if (e.ok) {
              var r = root.parameterData.pageNum;
              1 == root.orderDataList.all.length && r > 1 && (r -= 1), root.OrderListView.render({pageNum: r})
            }
          }), t.window("close")
        }).window({id: "dialog-confirm", title: "您确定已经收货？"})
      }, render: function (e) {
        var r = "", t = "", o = {};
        root.OrderListView.showLoadingData(), root.parameterData = root.OrderListView.initParameter(e), "" == root.parameterData.status || 100 == Number(root.parameterData.status) ? (t = OrderView.Urls.orderList, o = {
          userId: OrderView.userId,
          pageNum: root.parameterData.pageNum,
          status: root.parameterData.status,
          pageSize: root.parameterData.pageSize,
          startTime: root.parameterData.startTime,
          endTime: root.parameterData.endTime,
          search: root.parameterData.search,
          deepth: 3
        }) : (t = OrderView.Urls.orderCeil, o = {userId: OrderView.userId, pageNum: root.parameterData.pageNum, status: root.parameterData.status, pageSize: root.parameterData.pageSize, startTime: root.parameterData.startTime, endTime: root.parameterData.endTime, search: root.parameterData.search, deepth: 3}), root.ajaxSubmit({url: t, json: o, dataType: "jsonp", async: !1}, function (t) {
          if (root.OrderListView.hideLoadingData(), t.ok) {
            if (root.orderDataList = t.data, 0 == root.orderDataList.all.length)root.$orderList.find(".ui-empty-data").show(); else for (var o = 0; o < root.orderDataList.all.length; o++)r = "" == root.parameterData.status || 100 == Number(root.parameterData.status) ? root.OrderListView.getOrderListHtml(root.orderDataList.all[o]) : root.OrderListView.getOrderCeilHtml(root.orderDataList.all[o]), root.$orderList.find(".order-list").append(r);
            e || root.OrderListView.refreshPage({pageNum: root.parameterData.pageNum})
          }
        })
      }, confirmOrderHandler: function () {
        root.$order_status = $(this).closest("td,th").prev(), root.$order_operate = $(this).closest("td,th"), root.$order_group = $(this).closest(".order-lbox"), $(".dialog-confirm-order").window("show")
      }, deleteOrderHandler: function () {
        root.$order_status = $(this).closest("td,th").prev(), root.$order_operate = $(this).closest("td,th"), root.$order_group = $(this).closest(".order-lbox"), $(".dialog-delete-order").window("show")
      }, cancelOrderHandler: function () {
        root.$order_status = $(this).closest("td,th").prev(), root.$order_operate = $(this).closest("td,th"), root.$order_group = $(this).closest(".order-lbox");
        var e = $(".dialog-cancel-order"), r = e.find("select").closest(".sod_select"), t = r.find(".sod_list");
        $sodPlaceholder = r.data("placeholder"), r.find("select option").first().attr("selected", !0), $sodPlaceholder && !r.data("prefix") && r.find(".sod_label").addClass("sod_placeholder").html($sodPlaceholder), t.children().first().hasClass("active") || t.children().removeClass("selected active").first().addClass("selected active"), e.find(".otherReason").hide(), $(".dialog-cancel-order").window("show")
      }, updateGoodsStatus: function () {
      }, onFindImg: function () {
        var e = event.scrElement;
        e.src = "http://static-web.b5m.com/ucenter-order/img/order-default.png", e.onerror = null
      }, getTrHtml: function () {
        var goodsCeil = arguments[0] ? arguments[0] : !1, goodsStatus = arguments[1] ? arguments[1] : 0, goodsTitle = "";
        if (goodsCeil) {
          var orderCeilBox = "", expressInfo = null != goodsCeil.expressInfo ? goodsCeil.expressInfo.split("+") : "", logisitcsDetail = "", orderDetail = "";
          return goodsTitle = goodsCeil.goodsName, root.isSearch && "" != root.searchKey && (goodsCeil.goodsName = goodsCeil.goodsName.replace(eval("/" + root.searchKey + "/g"), '<font color="#FF7A4D">' + root.searchKey + "</font>")), orderDetail = '<a href="' + baseUrl + "/dh/page/order/goods/detail/view.htm?orderNum=" + goodsCeil.orderNum + "&company=" + ("" != expressInfo ? expressInfo[0] : "") + "&number=" + ("" != expressInfo ? expressInfo[1] : "") + '" class="order-handle" target="_blank">订单详情</a>', 0 == goodsCeil.goodsType && "" != expressInfo && (logisitcsDetail = '<a href="' + baseUrl + "/dh/page/order/goods/logistics/view.htm?company=" + expressInfo[0] + "&number=" + expressInfo[1] + "&orderNum=" + goodsCeil.orderNum + '" class="order-handle" target="_blank">物流详情</a>'), orderCeilBox += '<tr class="tr">', orderCeilBox += '<td class="tx-left td">', "WAP" == goodsCeil.channel || "APP" == goodsCeil.channel || "" == goodsCeil.goodsUrl ? (orderCeilBox += '<span class="order-img imgc"><img class="imge" src="' + goodsCeil.goodsImgUrl + '" alt=""><!--[if lt IE 8]><span class="iecp"></span><![endif]--></span>', orderCeilBox += '<span class="order-name">' + (0 == goodsCeil.goodsType ? "<span>【" + goodsCeil.goodsSource + "】</span>" : "") + goodsCeil.goodsName + "</span>") : (orderCeilBox += '<a class="order-img imgc" href="' + goodsCeil.goodsUrl + '" title="查看商品详情" target="_blank"><img class="imge" src="' + goodsCeil.goodsImgUrl + '" alt=""><!--[if lt IE 8]><span class="iecp"></span><![endif]--></a>', orderCeilBox += '<a class="order-name" href="' + goodsCeil.goodsUrl + '" title="" target="_blank">' + (0 == goodsCeil.goodsType ? "<span>【" + goodsCeil.goodsSource + "】</span>" : "") + goodsCeil.goodsName + "</a>"), orderCeilBox += "</td>", orderCeilBox += '<td class="td">' + ("" == goodsCeil.goodsSpec ? "--" : goodsCeil.goodsSpec) + "</td>", orderCeilBox += '<td class="td" title="' + goodsCeil.goodsPrice + '">' + goodsCeil.goodsPrice + "</td>", orderCeilBox += '<td class="td">x' + goodsCeil.goodsNum + "</td>", orderCeilBox += '<td class="td"><strong class="order-price">' + Number(goodsCeil.goodsPrice).toFixed(2) + "</strong></td>", 100 === goodsCeil.statusNew || 100 == goodsStatus || 101 == goodsStatus ? (orderCeilBox += '<td class="order-status td" rel=' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + ">--</td>", orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">--</td>') : 200 === goodsCeil.statusNew ? (orderCeilBox += '<td class="order-status td" rel="' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + '">已付款</td>', orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">', orderCeilBox += orderDetail, 200 == goodsCeil.optStatus ? orderCeilBox += '<a href="http://order.b5m.com/dh/page/order/goods/refund/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">退货/退款</a>' : (211 == goodsCeil.optStatus || 212 == goodsCeil.optStatus || 213 == goodsCeil.optStatus) && (orderCeilBox += '<a href="http://order.b5m.com/dh/page/order/goods/refund/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">退款处理中</a>'), orderCeilBox += "</td>") : 300 === goodsCeil.statusNew ? (orderCeilBox += '<td class="order-status td" rel=' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + ">已发货</td>", orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">', orderCeilBox += orderDetail, orderCeilBox += logisitcsDetail, orderCeilBox += '<a href="javascript:void(0);" class="order-handle confirm">确认收货</a>', orderCeilBox += '<span class="order-handle lock order-tips">退款/退货<div class="order-pop"><i class="icon-arr"></i>如需申请退货，点击确认收货后即可进行，如有疑问请致电会员顾问 <strong>400-085-0505(09:30-22:00)</strong></div></span>', orderCeilBox += "</td>") : 400 === goodsCeil.statusNew ? (orderCeilBox += '<td class="order-status td" rel=' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + ">已收货</td>", orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">', orderCeilBox += orderDetail, orderCeilBox += logisitcsDetail, orderCeilBox += 400 == goodsCeil.optStatus ? '<a href="http://order.b5m.com/dh/page/order/goods/return/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">退货/退款</a>' : 401 == goodsCeil.optStatus || 402 == goodsCeil.optStatus || 411 == goodsCeil.optStatus || 412 == goodsCeil.optStatus ? '<a href="http://order.b5m.com/dh/page/order/goods/return/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">退货处理中</a>' : 403 == goodsCeil.optStatus ? '<a href="http://order.b5m.com/dh/page/order/goods/return/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">请退货</a>' : '<span class="order-handle">退款处理中</span>', orderCeilBox += "</td>") : 500 === goodsCeil.statusNew ? (orderCeilBox += '<td class="order-status td" rel=' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + ">交易成功</td>", orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">', orderCeilBox += goodsCeil.evaluationId ? '<a class="evaluation had" href="javascript:;">已评价</a>' : '<a class="evaluation no" href="http://order.b5m.com/dh/page/order/goods/evaluation/view.htm?goodsId=' + goodsCeil.id + '" target="_blank">评价</a>', orderCeilBox += orderDetail, orderCeilBox += logisitcsDetail, orderCeilBox += "</td>") : 600 === goodsCeil.statusNew ? (orderCeilBox += '<td class="order-status td" rel=' + goodsCeil.statusNew + "--" + goodsCeil.optStatus + ">交易关闭</td>", orderCeilBox += '<td class="order-operate td" data-lbtr-orderNum="' + goodsCeil.orderNum + '" data-lbtr-id="' + goodsCeil.id + '">', orderCeilBox += orderDetail, orderCeilBox += logisitcsDetail, orderCeilBox += 216 == goodsCeil.preOptStatus || 236 == goodsCeil.preOptStatus || 426 == goodsCeil.preOptStatus ? '<a href="http://order.b5m.com/dh/page/order/goods/refund/view.htm?goodsNum=' + goodsCeil.orderNum + "&orderId=" + goodsCeil.id + '" class="order-handle" target="_blank">查看退款</a>' : '<a href="javascript:void(0);" class="order-handle delete">删除</a>', orderCeilBox += "</td>") : ("" == goodsCeil.statusNew || null == goodsCeil.statusNew) && (orderCeilBox += '<td class="order-status td">--</td>', orderCeilBox += '<td class="order-operate td">--</td>'), orderCeilBox += "</tr>"
        }
      }, couponHtml: function (e) {
        var r = "";
        return null == e.favorablePrice || null == e.favorablePrice || 0 == parseFloat(e.favorablePrice) && 0 == parseFloat(e.favorablePrice) || (r += ['<div class="fav-price"><span class="fac-title">我的优惠</span>', '<div class="fav-price-data order-pop"><i class="icon-arr"></i>', 0 != parseInt(e.favorablePrice) ? "<span>商品补贴：<em>&yen;" + Number(e.favorablePrice).toFixed(2) + "</em></span>" : "", 0 != parseInt(e.favorableFee) ? "<span>运费补贴：<em>&yen;" + Number(e.favorableFee).toFixed(2) + "</em></span>" : "", "</div>", "</div>"].join("")), r
      }, priceDetail: function (e) {
        var r = "";
        return null != e.superBz && 0 != parseFloat(e.superBz) && parseFloat(e.superBz / 100) <= parseFloat(e.payPrice) && (r = '<div class="price-tip">	        			<span class="ptip-title"></span>		        		<div class="ptip-data order-pop"><i class="icon-arr"></i>		        		<table class="ptip-table">		        		<colgroup><col width="88"><col width="89"></colgroup>						<thead><tr><th>明细</th><th>金额（元）</th></tr></thead>						<tbody>							' + (0 == Number(e.payPrice - e.superBz / 100) ? "" : "<tr><td>支付额</td><td>" + Number(e.payPrice - e.superBz / 100).toFixed(2) + "</td></tr>") + "							<tr><td>超级帮钻</td><td>" + Number(e.superBz / 100).toFixed(2) + "</td></tr>						</tbody>						</table></div></div>"), r
      }, getOrderListHtml: function (e) {
        var r = "", t = "";
        !vipInfo || null == vipInfo.data || 2 != vipInfo.data.type && 1 != vipInfo.data.type || (t = '<em class="vip-mark">VIP</em>'), r = ['<table class="order-lbox">', "<colgroup>", '<col width="249">', '<col width="100">', '<col width="90">', '<col width="39">', '<col width="115">', '<col width="77">', '<col width="92">', "</colgroup>", "<thead>"].join(""), r += '<tr class="tr">', r += '<th class="tx-left th"><strong class="order-time">' + root.formatTime("Y-m-d", e.addTime / 1e3) + '</strong><strong class="order-number">支付号：' + e.groupId + "</strong></th>", r += '<th class="th">--</th>', r += '<th class="th">--</th>', r += '<th class="th">' + (e.goodsNumber ? e.goodsNumber : 0) + "</th>", r += '<th class="th"><strong class="order-th-price">' + Number(e.payPrice).toFixed(2) + root.OrderListView.priceDetail(e) + '</strong><i class="order-price-tip">(含运费：' + Number(e.totalFee - e.favorableFee).toFixed(2) + ")</i>" + root.OrderListView.couponHtml(e) + "</th>", 100 === e.status ? (r += '<th class="th">等待付款</th>', r += ['<th class="th" data-lbtr-orderNum="' + e.groupId + '" data-lbtr-id="' + e.id + '"><a class="order-pay no" href="' + e.payLink + '" target="_blank">付&emsp;款</a>', '<a href="javascript:void(0);" class="order-handle cancel">取消订单</a> ', "</th>"].join("")) : 101 === e.status ? (r += '<th class="th" rel="' + e.status + '">付款中</th>', r += 0 != parseInt(e.superBz) ? ['<th class="th" data-lbtr-orderNum="' + e.groupId + '" data-lbtr-id="' + e.id + '"><a class="order-pay no" href="' + e.payLink + '" target="_blank">付&emsp;款</a>', '<a href="javascript:void(0);" class="order-handle cancel">取消订单</a> ', "</th>"].join("") : '<th class="th">--</th>') : (r += '<th class="th" rel="' + e.status + '">--</th>', r += '<th class="th">--</th>'), r += "</tr></thead><tbody>";
        for (var o = 0; o < e.orderList.length; o++)if (e.orderList[o].goodsList.length) {
          r += '<tr class="order-title tr">', r += '<td class="tx-left tr-head td" colspan="7"><span class="goods-source">' + (0 == e.orderList[o].goodsList[0].goodsType ? e.orderList[o].goodsList[0].goodsSource : "") + "</span>订单编号：" + e.orderList[o].orderNum + "</td>", r += "</tr>";
          for (var a = 0; a < e.orderList[o].goodsList.length; a++)r += root.OrderListView.getTrHtml(e.orderList[o].goodsList[a], e.status)
        }
        return r += ["</tbody>", "</table>"].join("")
      }, getOrderCeilHtml: function (e) {
        var r = "";
        return r = ['<table class="order-lbox">', "<colgroup>", '<col width="229">', '<col width="100">', '<col width="90">', '<col width="59">', '<col width="105">', '<col width="87">', '<col width="92">', "</colgroup>", "<tbody>"].join(""), r += '<tr class="tr">', r += '<td class="tx-left tr-head td" colspan="7"><span class="goods-source">' + (0 == e.goodsType ? e.goodsSource : "") + "</span>订单编号：" + e.orderNum + "</td>", r += "</tr>", r += root.OrderListView.getTrHtml(e), r += ["</tbody>", "</table>"].join("")
      }, initParameter: function (e) {
        return $.extend({pageNum: 1, pageSize: 5, showPage: !1, status: root.orderStatus, endTime: root.endTime, startTime: root.stTime, search: root.searchKey}, e)
      }, refreshPage: function (e) {
        $(".page-view").page({
          pageNum: e.pageNum, total: root.orderDataList.totalCount, pageSize: root.parameterData.pageSize, onClick: function (e) {
            root.OrderListView.render({pageNum: e})
          }
        })
      }, showLoadingData: function () {
        root.$orderList.find(".ui-loading").show(), root.$orderList.find(".order-list").empty(), root.$orderList.find(".ui-empty-data").hide()
      }, hideLoadingData: function () {
        root.$orderList.find(".ui-loading").hide(), root.$orderList.find(".order-list").empty(), root.$orderList.find(".ui-empty-data").hide()
      }
    }, {OrderFiltView: OrderView.Views.OrderFiltView, OrderListView: OrderView.Views.OrderListView}
  })
}(require);