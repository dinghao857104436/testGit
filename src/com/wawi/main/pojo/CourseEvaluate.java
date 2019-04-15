package com.wawi.main.pojo;

import java.io.Serializable;

public class CourseEvaluate implements Serializable {
    /**
     * 上课评价ID
     */
    private String id;

    /**
     * 教学计划ID
     */
    private String planId;

    /**
     * 评价人ID
     */
    private String traineeId;

    /**
     * 教学满意度
     */
    private Integer level;

    /**
     * 评价详情
     */
    private String summary;

    /**
     * 可用状态
     */
    private String status;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public String getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId == null ? null : traineeId.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planId=").append(planId);
        sb.append(", traineeId=").append(traineeId);
        sb.append(", level=").append(level);
        sb.append(", summary=").append(summary);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}