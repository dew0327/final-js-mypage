package myProject_LSP;

import javax.persistence.*;
import java.util.List;

@Entity
@org.hibernate.annotations.DynamicUpdate
@Table(name="Mypage_table")
public class Mypage {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Integer restaurantId;
    private Integer restaurantMenuId;
    private Integer customerId;
    private Integer qty;
    private String orderStatus;
    private Long orderId;
    private Long cookId;
    private String cookStatus;
    private String deliveryStatus;
    //수정
    private Long pointId;
    private String pointStatus;
    private Long pointSendDate;
    private String pointKind;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
    public Integer getRestaurantMenuId() {
        return restaurantMenuId;
    }

    public void setRestaurantMenuId(Integer restaurantMenuId) {
        this.restaurantMenuId = restaurantMenuId;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getCookId() {
        return cookId;
    }

    public void setCookId(Long cookId) {
        this.cookId = cookId;
    }
    public String getCookStatus() {
        return cookStatus;
    }

    public void setCookStatus(String cookStatus) {
        this.cookStatus = cookStatus;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Long getPointId() {
        return pointId;
    }

    public void setPointId(Long pointId) {
        this.pointId = pointId;
    }

    public String getPointStatus() {
        return pointStatus;
    }

    public void setPointStatus(String pointStatus) {
        this.pointStatus = pointStatus;
    }

    public Long getPointSendDate() {
        return pointSendDate;
    }

    public void setPointSendDate(Long pointSendDate) {
        this.pointSendDate = pointSendDate;
    }

    public String getPointKind() {
        return pointKind;
    }

    public void setPointKind(String pointKind) {
        this.pointKind = pointKind;
    }
}

