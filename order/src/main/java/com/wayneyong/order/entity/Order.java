package com.wayneyong.order.entity;

import com.wayneyong.order.dto.FoodItemsDTO;
import com.wayneyong.order.dto.RestaurantDTO;
import com.wayneyong.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Integer orderId;
    private List<FoodItemsDTO> foodItemDTOList;
    private RestaurantDTO restaurant;
    private UserDTO userDTO;

}
