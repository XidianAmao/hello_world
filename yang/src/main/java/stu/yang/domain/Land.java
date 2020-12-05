package stu.yang.domain;

import java.util.StringJoiner;

/**
 * 主表信息
 */
public class Land {
    private String landNo;
    private Integer cityNo;
    private String landPropertyNo;
    private String landProperty;
    private Integer landArea;
    private String landAddress;
    private String createdUser;

    public String getLandNo() {
        return landNo;
    }

    public void setLandNo(String landNo) {
        this.landNo = landNo;
    }

    public Integer getCityNo() {
        return cityNo;
    }

    public void setCityNo(Integer cityNo) {
        this.cityNo = cityNo;
    }

    public String getLandPropertyNo() {
        return landPropertyNo;
    }

    public void setLandPropertyNo(String landPropertyNo) {
        this.landPropertyNo = landPropertyNo;
    }

    public String getLandProperty() {
        return landProperty;
    }

    public void setLandProperty(String landProperty) {
        this.landProperty = landProperty;
    }

    public Integer getLandArea() {
        return landArea;
    }

    public void setLandArea(Integer landArea) {
        this.landArea = landArea;
    }

    public String getLandAddress() {
        return landAddress;
    }

    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Land.class.getSimpleName() + "[", "]")
                .add("landNo='" + landNo + "'")
                .add("cityNo=" + cityNo)
                .add("landPropertyNo='" + landPropertyNo + "'")
                .add("landProperty='" + landProperty + "'")
                .add("landArea=" + landArea)
                .add("landAddress='" + landAddress + "'")
                .add("createdUser='" + createdUser + "'")
                .toString();
    }
}
