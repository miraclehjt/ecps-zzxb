package com.rl.ecps.model;

public class EbArea {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_AREA.AREA_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    private Long areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_AREA.PARENT_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_AREA.AREA_NAME
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    private Object areaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_AREA.AREA_LEVEL
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    private Short areaLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_AREA.AREA_ID
     *
     * @return the value of EB_AREA.AREA_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_AREA.AREA_ID
     *
     * @param areaId the value for EB_AREA.AREA_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_AREA.PARENT_ID
     *
     * @return the value of EB_AREA.PARENT_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_AREA.PARENT_ID
     *
     * @param parentId the value for EB_AREA.PARENT_ID
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_AREA.AREA_NAME
     *
     * @return the value of EB_AREA.AREA_NAME
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public Object getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_AREA.AREA_NAME
     *
     * @param areaName the value for EB_AREA.AREA_NAME
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public void setAreaName(Object areaName) {
        this.areaName = areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_AREA.AREA_LEVEL
     *
     * @return the value of EB_AREA.AREA_LEVEL
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public Short getAreaLevel() {
        return areaLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_AREA.AREA_LEVEL
     *
     * @param areaLevel the value for EB_AREA.AREA_LEVEL
     *
     * @mbggenerated Sat Mar 25 17:28:08 CST 2017
     */
    public void setAreaLevel(Short areaLevel) {
        this.areaLevel = areaLevel;
    }
}