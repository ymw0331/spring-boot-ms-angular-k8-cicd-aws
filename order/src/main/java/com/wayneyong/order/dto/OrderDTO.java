package com.wayneyong.order.dto;

import java.util.List;

public class OrderDTO {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemDTOList;
    private RestaurantDTO restaurant;
    private UserDTO userDTO;

}
