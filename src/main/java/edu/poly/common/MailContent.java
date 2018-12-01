package edu.poly.common;

public class MailContent {
    public static String ACTIVE_USER(String userName, String email, String name, String token) {
        String body = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\n" +
                "    <!--[if gte mso 9]><xml>\n" +
                "     <o:OfficeDocumentSettings>\n" +
                "      <o:AllowPNG/>\n" +
                "      <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "     </o:OfficeDocumentSettings>\n" +
                "    </xml><![endif]-->\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "    <title></title>\n" +
                "    \n" +
                "    \n" +
                "    <style type=\"text/css\" id=\"media-query\">\n" +
                "      body {\n" +
                "  margin: 0;\n" +
                "  padding: 0; }\n" +
                "\n" +
                "table, tr, td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse; }\n" +
                "\n" +
                ".ie-browser table, .mso-container table {\n" +
                "  table-layout: fixed; }\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit; }\n" +
                "\n" +
                "a[x-apple-data-detectors=true] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important; }\n" +
                "\n" +
                "[owa] .img-container div, [owa] .img-container button {\n" +
                "  display: block !important; }\n" +
                "\n" +
                "[owa] .fullwidth button {\n" +
                "  width: 100% !important; }\n" +
                "\n" +
                "[owa] .block-grid .col {\n" +
                "  display: table-cell;\n" +
                "  float: none !important;\n" +
                "  vertical-align: top; }\n" +
                "\n" +
                ".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\n" +
                "  width: 600px !important; }\n" +
                "\n" +
                ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\n" +
                "  line-height: 100%; }\n" +
                "\n" +
                ".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\n" +
                "  width: 200px !important; }\n" +
                "\n" +
                ".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\n" +
                "  width: 400px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\n" +
                "  width: 300px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\n" +
                "  width: 200px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\n" +
                "  width: 150px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\n" +
                "  width: 120px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\n" +
                "  width: 100px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\n" +
                "  width: 85px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\n" +
                "  width: 75px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\n" +
                "  width: 66px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\n" +
                "  width: 60px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\n" +
                "  width: 54px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\n" +
                "  width: 50px !important; }\n" +
                "\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .block-grid {\n" +
                "    width: 600px !important; }\n" +
                "  .block-grid .col {\n" +
                "    vertical-align: top; }\n" +
                "    .block-grid .col.num12 {\n" +
                "      width: 600px !important; }\n" +
                "  .block-grid.mixed-two-up .col.num4 {\n" +
                "    width: 200px !important; }\n" +
                "  .block-grid.mixed-two-up .col.num8 {\n" +
                "    width: 400px !important; }\n" +
                "  .block-grid.two-up .col {\n" +
                "    width: 300px !important; }\n" +
                "  .block-grid.three-up .col {\n" +
                "    width: 200px !important; }\n" +
                "  .block-grid.four-up .col {\n" +
                "    width: 150px !important; }\n" +
                "  .block-grid.five-up .col {\n" +
                "    width: 120px !important; }\n" +
                "  .block-grid.six-up .col {\n" +
                "    width: 100px !important; }\n" +
                "  .block-grid.seven-up .col {\n" +
                "    width: 85px !important; }\n" +
                "  .block-grid.eight-up .col {\n" +
                "    width: 75px !important; }\n" +
                "  .block-grid.nine-up .col {\n" +
                "    width: 66px !important; }\n" +
                "  .block-grid.ten-up .col {\n" +
                "    width: 60px !important; }\n" +
                "  .block-grid.eleven-up .col {\n" +
                "    width: 54px !important; }\n" +
                "  .block-grid.twelve-up .col {\n" +
                "    width: 50px !important; } }\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .block-grid, .col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important; }\n" +
                "  .block-grid {\n" +
                "    width: calc(100% - 40px) !important; }\n" +
                "  .col {\n" +
                "    width: 100% !important; }\n" +
                "    .col > div {\n" +
                "      margin: 0 auto; }\n" +
                "  img.fullwidth, img.fullwidthOnMobile {\n" +
                "    max-width: 100% !important; }\n" +
                "  .no-stack .col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important; }\n" +
                "  .no-stack.two-up .col {\n" +
                "    width: 50% !important; }\n" +
                "  .no-stack.mixed-two-up .col.num4 {\n" +
                "    width: 33% !important; }\n" +
                "  .no-stack.mixed-two-up .col.num8 {\n" +
                "    width: 66% !important; }\n" +
                "  .no-stack.three-up .col.num4 {\n" +
                "    width: 33% !important; }\n" +
                "  .no-stack.four-up .col.num3 {\n" +
                "    width: 25% !important; }\n" +
                "  .mobile_hide {\n" +
                "    min-height: 0px;\n" +
                "    max-height: 0px;\n" +
                "    max-width: 0px;\n" +
                "    display: none;\n" +
                "    overflow: hidden;\n" +
                "    font-size: 0px; } }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #f56a00\">\n" +
                "  <style type=\"text/css\" id=\"media-query-bodytag\">\n" +
                "    @media (max-width: 520px) {\n" +
                "      .block-grid {\n" +
                "        min-width: 320px!important;\n" +
                "        max-width: 100%!important;\n" +
                "        width: 100%!important;\n" +
                "        display: block!important;\n" +
                "      }\n" +
                "\n" +
                "      .col {\n" +
                "        min-width: 320px!important;\n" +
                "        max-width: 100%!important;\n" +
                "        width: 100%!important;\n" +
                "        display: block!important;\n" +
                "      }\n" +
                "\n" +
                "        .col > div {\n" +
                "          margin: 0 auto;\n" +
                "        }\n" +
                "\n" +
                "      img.fullwidth {\n" +
                "        max-width: 100%!important;\n" +
                "      }\n" +
                "\t\t\timg.fullwidthOnMobile {\n" +
                "        max-width: 100%!important;\n" +
                "      }\n" +
                "      .no-stack .col {\n" +
                "\t\t\t\tmin-width: 0!important;\n" +
                "\t\t\t\tdisplay: table-cell!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.two-up .col {\n" +
                "\t\t\t\twidth: 50%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.mixed-two-up .col.num4 {\n" +
                "\t\t\t\twidth: 33%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.mixed-two-up .col.num8 {\n" +
                "\t\t\t\twidth: 66%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.three-up .col.num4 {\n" +
                "\t\t\t\twidth: 33%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.four-up .col.num3 {\n" +
                "\t\t\t\twidth: 25%!important;\n" +
                "\t\t\t}\n" +
                "      .mobile_hide {\n" +
                "        min-height: 0px!important;\n" +
                "        max-height: 0px!important;\n" +
                "        max-width: 0px!important;\n" +
                "        display: none!important;\n" +
                "        overflow: hidden!important;\n" +
                "        font-size: 0px!important;\n" +
                "      }\n" +
                "    }\n" +
                "  </style>\n" +
                "  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #f56a00;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "\t<tbody>\n" +
                "\t<tr style=\"vertical-align: top\">\n" +
                "\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #f56a00;\"><![endif]-->\n" +
                "\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #283C4B;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#283C4B;\">\n" +
                "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#283C4B;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#283C4B;\"><![endif]-->\n" +
                "\n" +
                "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
                "\n" +
                "                  \n" +
                "                    <div align=\"center\" class=\"img-container center fixedwidth \" style=\"padding-right: 25px;  padding-left: 25px;\">\n" +
                "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr style=\"line-height:0px;line-height:0px;\"><td style=\"padding-right: 25px; padding-left: 25px;\" align=\"center\"><![endif]-->\n" +
                "<div style=\"line-height:25px;font-size:1px\">&#160;</div>  <a href=\"http://kuminhdey.org\" target=\"_blank\">\n" +
                "    <img class=\"center fixedwidth\" align=\"center\" border=\"0\" src=\"https://i.imgur.com/BqDzzL6.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;width: 100%;max-width: 420px\" width=\"420\">\n" +
                "  </a>\n" +
                "<div style=\"line-height:25px;font-size:1px\">&#160;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
                "</div>\n" +
                "</div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #f56a00;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#f56a00;\">\n" +
                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\">\n" +
                "                    <div class=\"\">\n" +
                "\t<div style=\"color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 30px; padding-bottom: 20px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:14px;color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 18px;line-height: 22px;text-align: center\"><span style=\"font-size: 24px; line-height: 28px;\">Xin Chào !</span></p></div>\t\n" +
                "\t</div>\n" +
                "\n" +
                "</div>        \n" +
                "<div align=\"center\" class=\"img-container center  autowidth  fullwidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
                "  <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://d1oco4z2z1fhwp.cloudfront.net/templates/default/66/password_icon_ok(0).jpg\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 600px\" width=\"600\">\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                " </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\n" +
                "         <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                " <div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\">\n" +
                " <div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\">Xin chào: " + name + "</span></strong></span></p><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\" mce-data-marked=\"1\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\" mce-data-marked=\"1\">Dưới đây là thông tin đăng ký của bạn:</span></strong></span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>        \n" +
                "    <div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Email: " + email + "</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Tên tài khoản: " + userName + "</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Mật khẩu: smarttrip</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Để kích hoạt tài khoản, bạn vui lòng click vào nút dưới đây:</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>  \n" +
                "<a href=\"http://localhost:8080/activeuser/" + token + "\" target=\"_blank\" style=\"text-decoration:none\"><div align=\"center\" class=\"button-container center \" style=\"padding-right: 0px; padding-left: 0px; padding-top:25px; padding-bottom:0px;\">\n" +
                "    <div style=\"color: #ffffff; background-color: #f56a00; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 246px; width: 206px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 10px; padding-right: 20px; padding-bottom: 10px; padding-left: 20px; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align: center; mso-border-alt: none;\">\n" +
                "      <span style=\"font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;font-size:16px;line-height:32px;\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 28px;\" mce-data-marked=\"1\" data-mce-style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 32px;\">Kích hoạt</span></span>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</a> <div class=\"\">\n" +
                "\t<div style=\"color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 20px; padding-bottom: 30px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:14px;color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 16px;\"><a style=\"color:#f56a00\" title=\"example\" href=\"http://localhost:8080/activeuser/\"+token+\" target=\"_blank\">Hoặc ấn vào đường link này</a></span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div align=\"center\" style=\"padding-right: 10px; padding-left: 10px; padding-bottom: 10px;\" class=\"\">\n" +
                "  <div style=\"line-height:20px;font-size:1px\">&#160;</div>\n" +
                "  <div style=\"display: table; max-width:161px;\">\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://www.facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "          <img src=\"https://i.imgur.com/jCvtCp9.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://i.imgur.com/TLUej7u.png\" title=\"Twitter\" target=\"_blank\">\n" +
                "          <img src=\"https://i.imgur.com/TLUej7u.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"http://plus.google.com/\" title=\"Google+\" target=\"_blank\">\n" +
                "          <img src=\"https://i.imgur.com/nGHkcvA.png\" alt=\"Google+\" title=\"Google+\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "  </div>\n" +
                "</div>\n" +
                " </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "</body></html>";
        return body;
    }

    public static String FORGOT_USER(String userName, String email, String name, String token) {
        String body = "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\n" +
                "    <!--[if gte mso 9]><xml>\n" +
                "     <o:OfficeDocumentSettings>\n" +
                "      <o:AllowPNG/>\n" +
                "      <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "     </o:OfficeDocumentSettings>\n" +
                "    </xml><![endif]-->\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
                "    <title></title>\n" +
                "    \n" +
                "    \n" +
                "    <style type=\"text/css\" id=\"media-query\">\n" +
                "      body {\n" +
                "  margin: 0;\n" +
                "  padding: 0; }\n" +
                "\n" +
                "table, tr, td {\n" +
                "  vertical-align: top;\n" +
                "  border-collapse: collapse; }\n" +
                "\n" +
                ".ie-browser table, .mso-container table {\n" +
                "  table-layout: fixed; }\n" +
                "\n" +
                "* {\n" +
                "  line-height: inherit; }\n" +
                "\n" +
                "a[x-apple-data-detectors=true] {\n" +
                "  color: inherit !important;\n" +
                "  text-decoration: none !important; }\n" +
                "\n" +
                "[owa] .img-container div, [owa] .img-container button {\n" +
                "  display: block !important; }\n" +
                "\n" +
                "[owa] .fullwidth button {\n" +
                "  width: 100% !important; }\n" +
                "\n" +
                "[owa] .block-grid .col {\n" +
                "  display: table-cell;\n" +
                "  float: none !important;\n" +
                "  vertical-align: top; }\n" +
                "\n" +
                ".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\n" +
                "  width: 600px !important; }\n" +
                "\n" +
                ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\n" +
                "  line-height: 100%; }\n" +
                "\n" +
                ".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\n" +
                "  width: 200px !important; }\n" +
                "\n" +
                ".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\n" +
                "  width: 400px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\n" +
                "  width: 300px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\n" +
                "  width: 200px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\n" +
                "  width: 150px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\n" +
                "  width: 120px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\n" +
                "  width: 100px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\n" +
                "  width: 85px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\n" +
                "  width: 75px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\n" +
                "  width: 66px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\n" +
                "  width: 60px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\n" +
                "  width: 54px !important; }\n" +
                "\n" +
                ".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\n" +
                "  width: 50px !important; }\n" +
                "\n" +
                "@media only screen and (min-width: 620px) {\n" +
                "  .block-grid {\n" +
                "    width: 600px !important; }\n" +
                "  .block-grid .col {\n" +
                "    vertical-align: top; }\n" +
                "    .block-grid .col.num12 {\n" +
                "      width: 600px !important; }\n" +
                "  .block-grid.mixed-two-up .col.num4 {\n" +
                "    width: 200px !important; }\n" +
                "  .block-grid.mixed-two-up .col.num8 {\n" +
                "    width: 400px !important; }\n" +
                "  .block-grid.two-up .col {\n" +
                "    width: 300px !important; }\n" +
                "  .block-grid.three-up .col {\n" +
                "    width: 200px !important; }\n" +
                "  .block-grid.four-up .col {\n" +
                "    width: 150px !important; }\n" +
                "  .block-grid.five-up .col {\n" +
                "    width: 120px !important; }\n" +
                "  .block-grid.six-up .col {\n" +
                "    width: 100px !important; }\n" +
                "  .block-grid.seven-up .col {\n" +
                "    width: 85px !important; }\n" +
                "  .block-grid.eight-up .col {\n" +
                "    width: 75px !important; }\n" +
                "  .block-grid.nine-up .col {\n" +
                "    width: 66px !important; }\n" +
                "  .block-grid.ten-up .col {\n" +
                "    width: 60px !important; }\n" +
                "  .block-grid.eleven-up .col {\n" +
                "    width: 54px !important; }\n" +
                "  .block-grid.twelve-up .col {\n" +
                "    width: 50px !important; } }\n" +
                "\n" +
                "@media (max-width: 620px) {\n" +
                "  .block-grid, .col {\n" +
                "    min-width: 320px !important;\n" +
                "    max-width: 100% !important;\n" +
                "    display: block !important; }\n" +
                "  .block-grid {\n" +
                "    width: calc(100% - 40px) !important; }\n" +
                "  .col {\n" +
                "    width: 100% !important; }\n" +
                "    .col > div {\n" +
                "      margin: 0 auto; }\n" +
                "  img.fullwidth, img.fullwidthOnMobile {\n" +
                "    max-width: 100% !important; }\n" +
                "  .no-stack .col {\n" +
                "    min-width: 0 !important;\n" +
                "    display: table-cell !important; }\n" +
                "  .no-stack.two-up .col {\n" +
                "    width: 50% !important; }\n" +
                "  .no-stack.mixed-two-up .col.num4 {\n" +
                "    width: 33% !important; }\n" +
                "  .no-stack.mixed-two-up .col.num8 {\n" +
                "    width: 66% !important; }\n" +
                "  .no-stack.three-up .col.num4 {\n" +
                "    width: 33% !important; }\n" +
                "  .no-stack.four-up .col.num3 {\n" +
                "    width: 25% !important; }\n" +
                "  .mobile_hide {\n" +
                "    min-height: 0px;\n" +
                "    max-height: 0px;\n" +
                "    max-width: 0px;\n" +
                "    display: none;\n" +
                "    overflow: hidden;\n" +
                "    font-size: 0px; } }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #f56a00\">\n" +
                "  <style type=\"text/css\" id=\"media-query-bodytag\">\n" +
                "    @media (max-width: 520px) {\n" +
                "      .block-grid {\n" +
                "        min-width: 320px!important;\n" +
                "        max-width: 100%!important;\n" +
                "        width: 100%!important;\n" +
                "        display: block!important;\n" +
                "      }\n" +
                "\n" +
                "      .col {\n" +
                "        min-width: 320px!important;\n" +
                "        max-width: 100%!important;\n" +
                "        width: 100%!important;\n" +
                "        display: block!important;\n" +
                "      }\n" +
                "\n" +
                "        .col > div {\n" +
                "          margin: 0 auto;\n" +
                "        }\n" +
                "\n" +
                "      img.fullwidth {\n" +
                "        max-width: 100%!important;\n" +
                "      }\n" +
                "\t\t\timg.fullwidthOnMobile {\n" +
                "        max-width: 100%!important;\n" +
                "      }\n" +
                "      .no-stack .col {\n" +
                "\t\t\t\tmin-width: 0!important;\n" +
                "\t\t\t\tdisplay: table-cell!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.two-up .col {\n" +
                "\t\t\t\twidth: 50%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.mixed-two-up .col.num4 {\n" +
                "\t\t\t\twidth: 33%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.mixed-two-up .col.num8 {\n" +
                "\t\t\t\twidth: 66%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.three-up .col.num4 {\n" +
                "\t\t\t\twidth: 33%!important;\n" +
                "\t\t\t}\n" +
                "\t\t\t.no-stack.four-up .col.num3 {\n" +
                "\t\t\t\twidth: 25%!important;\n" +
                "\t\t\t}\n" +
                "      .mobile_hide {\n" +
                "        min-height: 0px!important;\n" +
                "        max-height: 0px!important;\n" +
                "        max-width: 0px!important;\n" +
                "        display: none!important;\n" +
                "        overflow: hidden!important;\n" +
                "        font-size: 0px!important;\n" +
                "      }\n" +
                "    }\n" +
                "  </style>\n" +
                "  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\n" +
                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
                "  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #f56a00;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "\t<tbody>\n" +
                "\t<tr style=\"vertical-align: top\">\n" +
                "\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #f56a00;\"><![endif]-->\n" +
                "\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #283C4B;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#283C4B;\">\n" +
                "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#283C4B;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#283C4B;\"><![endif]-->\n" +
                "\n" +
                "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
                "\n" +
                "                  \n" +
                "                    <div align=\"center\" class=\"img-container center fixedwidth \" style=\"padding-right: 25px;  padding-left: 25px;\">\n" +
                "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr style=\"line-height:0px;line-height:0px;\"><td style=\"padding-right: 25px; padding-left: 25px;\" align=\"center\"><![endif]-->\n" +
                "<div style=\"line-height:25px;font-size:1px\">&nbsp;</div>  <a href=\"http://kuminhdey.org\" target=\"_blank\">\n" +
                "    <img class=\"center fixedwidth\" align=\"center\" border=\"0\" src=\"https://i.imgur.com/BqDzzL6.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;width: 100%;max-width: 420px\" width=\"420\">\n" +
                "  </a>\n" +
                "<div style=\"line-height:25px;font-size:1px\">&nbsp;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
                "</div>\n" +
                "</div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #f56a00;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#f56a00;\">\n" +
                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\">\n" +
                "                    <div class=\"\">\n" +
                "\t<div style=\"color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 30px; padding-bottom: 20px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:14px;color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 18px;line-height: 22px;text-align: center\"><span style=\"font-size: 24px; line-height: 28px;\">Xin Chào !</span></p></div>\t\n" +
                "\t</div>\n" +
                "\n" +
                "</div>        \n" +
                "<div align=\"center\" class=\"img-container center  autowidth  fullwidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
                "  <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://d1oco4z2z1fhwp.cloudfront.net/templates/default/66/password_icon_ok(0).jpg\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 600px\" width=\"600\">\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                " </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div style=\"background-color:#283C4B;\">\n" +
                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\n" +
                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\n" +
                "         <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
                " <div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\">\n" +
                " <div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\">Xin chào: "+ name +"</span></strong></span></p><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\" mce-data-marked=\"1\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\" mce-data-marked=\"1\">Dưới đây là thông tin của bạn:</span></strong></span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>        \n" +
                "    <div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Email: "+ email +"</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Tên tài khoản: "+ userName +"</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div class=\"\">\n" +
                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Để lấy lại mật khẩu, bạn vui lòng click vào nút dưới đây:</span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>  \n" +
                "<a href=\"http://localhost:8080/forgotuser/"+ token +"\" target=\"_blank\" style=\"text-decoration:none\"><div align=\"center\" class=\"button-container center \" style=\"padding-right: 0px; padding-left: 0px; padding-top:25px; padding-bottom:0px;\">\n" +
                "    <div style=\"color: #ffffff; background-color: #f56a00; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 246px; width: 206px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 10px; padding-right: 20px; padding-bottom: 10px; padding-left: 20px; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align: center; mso-border-alt: none;\">\n" +
                "      <span style=\"font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;font-size:16px;line-height:32px;\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 28px;\" mce-data-marked=\"1\" data-mce-style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 32px;\">Lấy lại mật khẩu</span></span>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</a> <div class=\"\">\n" +
                "\t<div style=\"color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 20px; padding-bottom: 30px;\">\t\n" +
                "\t\t<div style=\"font-size:12px;line-height:14px;color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 16px;\"><a style=\"color:#f56a00\" title=\"example\" href=\"http://localhost:8080/forgotuser/"+ token +" target=\"_blank\">Hoặc ấn vào đường link này</a></span></p></div>\t\n" +
                "\t</div>\n" +
                "</div>\n" +
                "<div align=\"center\" style=\"padding-right: 10px; padding-left: 10px; padding-bottom: 10px;\" class=\"\">\n" +
                "  <div style=\"line-height:20px;font-size:1px\">&nbsp;</div>\n" +
                "  <div style=\"display: table; max-width:161px;\">\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://www.facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
                "          <img src=\"https://i.imgur.com/jCvtCp9.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&nbsp;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"https://i.imgur.com/TLUej7u.png\" title=\"Twitter\" target=\"_blank\">\n" +
                "          <img src=\"images/twitter.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&nbsp;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
                "        <a href=\"http://plus.google.com/\" title=\"Google+\" target=\"_blank\">\n" +
                "          <img src=\"https://i.imgur.com/nGHkcvA.png\" alt=\"Google+\" title=\"Google+\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
                "        </a>\n" +
                "      <div style=\"line-height:5px;font-size:1px\">&nbsp;</div>\n" +
                "      </td></tr>\n" +
                "    </tbody></table>\n" +
                "  </div>\n" +
                "</div>\n" +
                " </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div></td></tr>\n" +
                "  </tbody>\n" +
                "  </table>\n" +
                "</body></html>";
        return body;
    }

//    public static String ACTIVE_PARTNER(String email, String name) {
//        String body = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\n" +
//                "    <!--[if gte mso 9]><xml>\n" +
//                "     <o:OfficeDocumentSettings>\n" +
//                "      <o:AllowPNG/>\n" +
//                "      <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
//                "     </o:OfficeDocumentSettings>\n" +
//                "    </xml><![endif]-->\n" +
//                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
//                "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
//                "    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
//                "    <title></title>\n" +
//                "    \n" +
//                "    \n" +
//                "    <style type=\"text/css\" id=\"media-query\">\n" +
//                "      body {\n" +
//                "  margin: 0;\n" +
//                "  padding: 0; }\n" +
//                "\n" +
//                "table, tr, td {\n" +
//                "  vertical-align: top;\n" +
//                "  border-collapse: collapse; }\n" +
//                "\n" +
//                ".ie-browser table, .mso-container table {\n" +
//                "  table-layout: fixed; }\n" +
//                "\n" +
//                "* {\n" +
//                "  line-height: inherit; }\n" +
//                "\n" +
//                "a[x-apple-data-detectors=true] {\n" +
//                "  color: inherit !important;\n" +
//                "  text-decoration: none !important; }\n" +
//                "\n" +
//                "[owa] .img-container div, [owa] .img-container button {\n" +
//                "  display: block !important; }\n" +
//                "\n" +
//                "[owa] .fullwidth button {\n" +
//                "  width: 100% !important; }\n" +
//                "\n" +
//                "[owa] .block-grid .col {\n" +
//                "  display: table-cell;\n" +
//                "  float: none !important;\n" +
//                "  vertical-align: top; }\n" +
//                "\n" +
//                ".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\n" +
//                "  width: 600px !important; }\n" +
//                "\n" +
//                ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\n" +
//                "  line-height: 100%; }\n" +
//                "\n" +
//                ".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\n" +
//                "  width: 200px !important; }\n" +
//                "\n" +
//                ".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\n" +
//                "  width: 400px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\n" +
//                "  width: 300px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\n" +
//                "  width: 200px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\n" +
//                "  width: 150px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\n" +
//                "  width: 120px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\n" +
//                "  width: 100px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\n" +
//                "  width: 85px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\n" +
//                "  width: 75px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\n" +
//                "  width: 66px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\n" +
//                "  width: 60px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\n" +
//                "  width: 54px !important; }\n" +
//                "\n" +
//                ".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\n" +
//                "  width: 50px !important; }\n" +
//                "\n" +
//                "@media only screen and (min-width: 620px) {\n" +
//                "  .block-grid {\n" +
//                "    width: 600px !important; }\n" +
//                "  .block-grid .col {\n" +
//                "    vertical-align: top; }\n" +
//                "    .block-grid .col.num12 {\n" +
//                "      width: 600px !important; }\n" +
//                "  .block-grid.mixed-two-up .col.num4 {\n" +
//                "    width: 200px !important; }\n" +
//                "  .block-grid.mixed-two-up .col.num8 {\n" +
//                "    width: 400px !important; }\n" +
//                "  .block-grid.two-up .col {\n" +
//                "    width: 300px !important; }\n" +
//                "  .block-grid.three-up .col {\n" +
//                "    width: 200px !important; }\n" +
//                "  .block-grid.four-up .col {\n" +
//                "    width: 150px !important; }\n" +
//                "  .block-grid.five-up .col {\n" +
//                "    width: 120px !important; }\n" +
//                "  .block-grid.six-up .col {\n" +
//                "    width: 100px !important; }\n" +
//                "  .block-grid.seven-up .col {\n" +
//                "    width: 85px !important; }\n" +
//                "  .block-grid.eight-up .col {\n" +
//                "    width: 75px !important; }\n" +
//                "  .block-grid.nine-up .col {\n" +
//                "    width: 66px !important; }\n" +
//                "  .block-grid.ten-up .col {\n" +
//                "    width: 60px !important; }\n" +
//                "  .block-grid.eleven-up .col {\n" +
//                "    width: 54px !important; }\n" +
//                "  .block-grid.twelve-up .col {\n" +
//                "    width: 50px !important; } }\n" +
//                "\n" +
//                "@media (max-width: 620px) {\n" +
//                "  .block-grid, .col {\n" +
//                "    min-width: 320px !important;\n" +
//                "    max-width: 100% !important;\n" +
//                "    display: block !important; }\n" +
//                "  .block-grid {\n" +
//                "    width: calc(100% - 40px) !important; }\n" +
//                "  .col {\n" +
//                "    width: 100% !important; }\n" +
//                "    .col > div {\n" +
//                "      margin: 0 auto; }\n" +
//                "  img.fullwidth, img.fullwidthOnMobile {\n" +
//                "    max-width: 100% !important; }\n" +
//                "  .no-stack .col {\n" +
//                "    min-width: 0 !important;\n" +
//                "    display: table-cell !important; }\n" +
//                "  .no-stack.two-up .col {\n" +
//                "    width: 50% !important; }\n" +
//                "  .no-stack.mixed-two-up .col.num4 {\n" +
//                "    width: 33% !important; }\n" +
//                "  .no-stack.mixed-two-up .col.num8 {\n" +
//                "    width: 66% !important; }\n" +
//                "  .no-stack.three-up .col.num4 {\n" +
//                "    width: 33% !important; }\n" +
//                "  .no-stack.four-up .col.num3 {\n" +
//                "    width: 25% !important; }\n" +
//                "  .mobile_hide {\n" +
//                "    min-height: 0px;\n" +
//                "    max-height: 0px;\n" +
//                "    max-width: 0px;\n" +
//                "    display: none;\n" +
//                "    overflow: hidden;\n" +
//                "    font-size: 0px; } }\n" +
//                "\n" +
//                "    </style>\n" +
//                "</head>\n" +
//                "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #f56a00\">\n" +
//                "  <style type=\"text/css\" id=\"media-query-bodytag\">\n" +
//                "    @media (max-width: 520px) {\n" +
//                "      .block-grid {\n" +
//                "        min-width: 320px!important;\n" +
//                "        max-width: 100%!important;\n" +
//                "        width: 100%!important;\n" +
//                "        display: block!important;\n" +
//                "      }\n" +
//                "\n" +
//                "      .col {\n" +
//                "        min-width: 320px!important;\n" +
//                "        max-width: 100%!important;\n" +
//                "        width: 100%!important;\n" +
//                "        display: block!important;\n" +
//                "      }\n" +
//                "\n" +
//                "        .col > div {\n" +
//                "          margin: 0 auto;\n" +
//                "        }\n" +
//                "\n" +
//                "      img.fullwidth {\n" +
//                "        max-width: 100%!important;\n" +
//                "      }\n" +
//                "\t\t\timg.fullwidthOnMobile {\n" +
//                "        max-width: 100%!important;\n" +
//                "      }\n" +
//                "      .no-stack .col {\n" +
//                "\t\t\t\tmin-width: 0!important;\n" +
//                "\t\t\t\tdisplay: table-cell!important;\n" +
//                "\t\t\t}\n" +
//                "\t\t\t.no-stack.two-up .col {\n" +
//                "\t\t\t\twidth: 50%!important;\n" +
//                "\t\t\t}\n" +
//                "\t\t\t.no-stack.mixed-two-up .col.num4 {\n" +
//                "\t\t\t\twidth: 33%!important;\n" +
//                "\t\t\t}\n" +
//                "\t\t\t.no-stack.mixed-two-up .col.num8 {\n" +
//                "\t\t\t\twidth: 66%!important;\n" +
//                "\t\t\t}\n" +
//                "\t\t\t.no-stack.three-up .col.num4 {\n" +
//                "\t\t\t\twidth: 33%!important;\n" +
//                "\t\t\t}\n" +
//                "\t\t\t.no-stack.four-up .col.num3 {\n" +
//                "\t\t\t\twidth: 25%!important;\n" +
//                "\t\t\t}\n" +
//                "      .mobile_hide {\n" +
//                "        min-height: 0px!important;\n" +
//                "        max-height: 0px!important;\n" +
//                "        max-width: 0px!important;\n" +
//                "        display: none!important;\n" +
//                "        overflow: hidden!important;\n" +
//                "        font-size: 0px!important;\n" +
//                "      }\n" +
//                "    }\n" +
//                "  </style>\n" +
//                "  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\n" +
//                "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
//                "  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #f56a00;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
//                "\t<tbody>\n" +
//                "\t<tr style=\"vertical-align: top\">\n" +
//                "\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
//                "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #f56a00;\"><![endif]-->\n" +
//                "\n" +
//                "    <div style=\"background-color:#283C4B;\">\n" +
//                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #283C4B;\" class=\"block-grid \">\n" +
//                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#283C4B;\">\n" +
//                "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#283C4B;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:#283C4B;\"><![endif]-->\n" +
//                "\n" +
//                "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
//                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
//                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
//                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
//                "\n" +
//                "                  \n" +
//                "                    <div align=\"center\" class=\"img-container center fixedwidth \" style=\"padding-right: 25px;  padding-left: 25px;\">\n" +
//                "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr style=\"line-height:0px;line-height:0px;\"><td style=\"padding-right: 25px; padding-left: 25px;\" align=\"center\"><![endif]-->\n" +
//                "<div style=\"line-height:25px;font-size:1px\">&#160;</div>  <a href=\"http://kuminhdey.org\" target=\"_blank\">\n" +
//                "    <img class=\"center fixedwidth\" align=\"center\" border=\"0\" src=\"https://i.imgur.com/BqDzzL6.png\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;width: 100%;max-width: 420px\" width=\"420\">\n" +
//                "  </a>\n" +
//                "<div style=\"line-height:25px;font-size:1px\">&#160;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
//                "</div>\n" +
//                "</div>\n" +
//                "              </div>\n" +
//                "            </div>\n" +
//                "        </div>\n" +
//                "      </div>\n" +
//                "    </div>\n" +
//                "    <div style=\"background-color:#283C4B;\">\n" +
//                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #f56a00;\" class=\"block-grid \">\n" +
//                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#f56a00;\">\n" +
//                "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
//                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
//                "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\">\n" +
//                "                    <div class=\"\">\n" +
//                "\t<div style=\"color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 30px; padding-bottom: 20px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:14px;color:#FFFFFF;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 18px;line-height: 22px;text-align: center\"><span style=\"font-size: 24px; line-height: 28px;\">Xin Chào !</span></p></div>\t\n" +
//                "\t</div>\n" +
//                "\n" +
//                "</div>        \n" +
//                "<div align=\"center\" class=\"img-container center  autowidth  fullwidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
//                "  <img class=\"center  autowidth  fullwidth\" align=\"center\" border=\"0\" src=\"https://d1oco4z2z1fhwp.cloudfront.net/templates/default/66/password_icon_ok(0).jpg\" alt=\"Image\" title=\"Image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 600px\" width=\"600\">\n" +
//                "</div>\n" +
//                "</div>\n" +
//                "</div>\n" +
//                " </div>\n" +
//                "        </div>\n" +
//                "      </div>\n" +
//                "    </div>\n" +
//                "    <div style=\"background-color:#283C4B;\">\n" +
//                "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #FFFFFF;\" class=\"block-grid \">\n" +
//                "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:#FFFFFF;\">\n" +
//                "         <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
//                "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
//                " <div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\">\n" +
//                " <div class=\"\">\n" +
//                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 10px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\">Xin chào: " + name + "</span></strong></span></p><p style=\"margin: 0;font-size: 12px;line-height: 18px;text-align: center\"><span style=\"font-size: 16px; line-height: 24px;\" mce-data-marked=\"1\"><strong><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; line-height: 24px; font-size: 16px;\" mce-data-marked=\"1\">Dưới đây là thông tin đăng ký của bạn:</span></strong></span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>        \n" +
//                "    <div class=\"\">\n" +
//                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Email: " + email + "</span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>\n" +
//                "<div class=\"\">\n" +
//                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Tên tài khoản: " + userName + "</span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>\n" +
//                "<div class=\"\">\n" +
//                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Mật khẩu: smarttrip</span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>\n" +
//                "<div class=\"\">\n" +
//                "\t<div style=\"color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:150%; padding-right: 30px; padding-left: 30px; padding-top: 10px; padding-bottom: 0px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:18px;color:#283C4B;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 18px\"><span style=\"font-size: 14px; line-height: 21px;\">Để kích hoạt tài khoản, bạn vui lòng click vào nút dưới đây:</span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>  \n" +
//                "<a href=\"http://localhost:8080/activeuser/" + token + "\" target=\"_blank\" style=\"text-decoration:none\"><div align=\"center\" class=\"button-container center \" style=\"padding-right: 0px; padding-left: 0px; padding-top:25px; padding-bottom:0px;\">\n" +
//                "    <div style=\"color: #ffffff; background-color: #f56a00; border-radius: 4px; -webkit-border-radius: 4px; -moz-border-radius: 4px; max-width: 246px; width: 206px;width: auto; border-top: 0px solid transparent; border-right: 0px solid transparent; border-bottom: 0px solid transparent; border-left: 0px solid transparent; padding-top: 10px; padding-right: 20px; padding-bottom: 10px; padding-left: 20px; font-family: Arial, 'Helvetica Neue', Helvetica, sans-serif; text-align: center; mso-border-alt: none;\">\n" +
//                "      <span style=\"font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;font-size:16px;line-height:32px;\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 28px;\" mce-data-marked=\"1\" data-mce-style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 32px;\">Kích hoạt</span></span>\n" +
//                "    </div>\n" +
//                "</div>\n" +
//                "</a> <div class=\"\">\n" +
//                "\t<div style=\"color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;line-height:120%; padding-right: 20px; padding-left: 20px; padding-top: 20px; padding-bottom: 30px;\">\t\n" +
//                "\t\t<div style=\"font-size:12px;line-height:14px;color:#555555;font-family:Arial, 'Helvetica Neue', Helvetica, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-family: 'lucida sans unicode', 'lucida grande', sans-serif; font-size: 14px; line-height: 16px;\"><a style=\"color:#f56a00\" title=\"example\" href=\"http://localhost:8080/activeuser/\"+token+\" target=\"_blank\">Hoặc ấn vào đường link này</a></span></p></div>\t\n" +
//                "\t</div>\n" +
//                "</div>\n" +
//                "<div align=\"center\" style=\"padding-right: 10px; padding-left: 10px; padding-bottom: 10px;\" class=\"\">\n" +
//                "  <div style=\"line-height:20px;font-size:1px\">&#160;</div>\n" +
//                "  <div style=\"display: table; max-width:161px;\">\n" +
//                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
//                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
//                "        <a href=\"https://www.facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
//                "          <img src=\"https://i.imgur.com/jCvtCp9.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
//                "        </a>\n" +
//                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
//                "      </td></tr>\n" +
//                "    </tbody></table>\n" +
//                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 10px\">\n" +
//                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
//                "        <a href=\"https://i.imgur.com/TLUej7u.png\" title=\"Twitter\" target=\"_blank\">\n" +
//                "          <img src=\"https://i.imgur.com/TLUej7u.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
//                "        </a>\n" +
//                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
//                "      </td></tr>\n" +
//                "    </tbody></table>\n" +
//                "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
//                "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
//                "        <a href=\"http://plus.google.com/\" title=\"Google+\" target=\"_blank\">\n" +
//                "          <img src=\"https://i.imgur.com/nGHkcvA.png\" alt=\"Google+\" title=\"Google+\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
//                "        </a>\n" +
//                "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
//                "      </td></tr>\n" +
//                "    </tbody></table>\n" +
//                "  </div>\n" +
//                "</div>\n" +
//                " </div>\n" +
//                "            </div>\n" +
//                "        </div>\n" +
//                "      </div>\n" +
//                "    </div>\n" +
//                "  </tr>\n" +
//                "  </tbody>\n" +
//                "  </table>\n" +
//                "</body></html>";
//        return body;
//    }
}
