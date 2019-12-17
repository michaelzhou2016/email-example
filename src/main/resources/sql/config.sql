create table billing_mail_config
(
    mail_type      int(2) default 0 not null comment '邮件表主键 邮件类型 0:BSS客户【在线充值】成功通知 1:BSS客户【线下汇款】申请'
        primary key,
    mail_subject   varchar(200)     null comment '邮件主题',
    mail_receivers varchar(400)     null comment '邮件接收人',
    mail_content   text             null comment '邮件内容',
    create_user    int              null comment '创建人',
    create_time    datetime         null comment '创建时间',
    remark         varchar(255)     null comment '备注信息'
)
    comment '邮件模板' charset = utf8;

INSERT INTO test.billing_mail_config (mail_type, mail_subject, mail_receivers, mail_content, create_user, create_time, remark) VALUES (0, 'BSS客户【在线充值】成功通知', '2547847965@qq.com;strength_zhou@126.com;', '<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8"/>
    <title>BSS客户【在线充值】成功通知</title>
</head>
<body>
<p>客户：<span th:text="${customer}"></span></p>
<p>操作人：<span th:text="${operator}"></span></p>
<p>支付方式：在线充值-微信</p>
<p>充值金额：<span th:text="${amount}"></span>元</p>
<p>操作时间：<span th:text="${date}"></span></p>
</body>
</html>', 1, '2019-12-17 09:42:56', '');
INSERT INTO test.billing_mail_config (mail_type, mail_subject, mail_receivers, mail_content, create_user, create_time, remark) VALUES (1, 'BSS客户【线下汇款】申请', '2547847965@qq.com;strength_zhou@126.com;', '<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8"/>
    <title>BSS客户【线下汇款】申请</title>
</head>
<body>
<p>客户：<span th:text="${customer}"></span></p>
<p>操作人：<span th:text="${operator}"></span></p>
<p>支付方式：线下汇款-银行转账</p>
<p>打款金额：<span th:text="${amount}"></span>元</p>
<p>付款账户名称：<span th:text="${account_name}"></span></p>
<p>付款账号：<span th:text="${account_number}"></span></p>
<p>支付截图：<img src="cid:snap_url"/></p>
<p>操作时间：<span th:text="${date}"></span></p>
</body>
</html>', 1, '2019-12-17 11:19:22', null);