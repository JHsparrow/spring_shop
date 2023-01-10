package com.myshop.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myshop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	List<Item> findByItemNm(String ItemNm);
	List<Item> findByItemNmOrItemDetail(String ItemNm, String ItemDetail);
	List<Item> findByItemNmOrItemSellStatus(String ItemNm, String ItemSellStatus);
	
	List<Item> findByPriceBetween(Integer price1, Integer price2);
	
	List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
	
	
	List<Item> findByRegTimeGreaterThan(String date);
	
	List<Item> findByItemSellStatusNotNull();
	
	
	List<Item> findByItemDetailEndsWith(String ItemDetail);
	
	
	
}
