package ai.guiji.email.entity;

import java.util.Date;

/**
 *
 * 邮件模板
 * @author zhouliliang
 * @date   2019/12/16
 */
public class BillingMailConfig {
    /**
     * 邮件表主键 邮件类型 0:BSS客户【在线充值】成功通知 1:BSS客户【线下汇款】申请
     */
    private Integer mailType;

    /**
     * 邮件主题
     */
    private String mailSubject;

    /**
     * 邮件接收人
     */
    private String mailReceivers;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 邮件内容
     */
    private String mailContent;

    public Integer getMailType() {
        return mailType;
    }

    public void setMailType(Integer mailType) {
        this.mailType = mailType;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailReceivers() {
        return mailReceivers;
    }

    public void setMailReceivers(String mailReceivers) {
        this.mailReceivers = mailReceivers;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }
}