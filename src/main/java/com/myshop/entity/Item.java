package com.myshop.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import com.myshop.constant.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {
	@Id
	@Column (name="item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String itemNm;
	
	@Column(nullable = false, name="price")
	private int price;
	
	@Column(nullable = false)
	private int stockNumber;
	
	@Lob
	@Column(nullable = false)
	private String itemDetail;
	
	@Enumerated(EnumType.STRING)	
	private ItemSellStatus itemSellStatus;
	
	
	private LocalDateTime regTime;
	private LocalDateTime updatetime;
}
