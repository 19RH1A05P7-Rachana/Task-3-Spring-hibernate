package com.motivity.dao;
import java.util.List;

//import com.pt.entities.Shoppingmall;
import org.springframework.stereotype.Repository;

import com.motivity.entities.Shoppingmall;

@Repository
public interface ShoppingDao {
	 void add(Shoppingmall shoppingmall);
	 void delete(Shoppingmall shoppingmall);
	 void update(Shoppingmall shoppingmall);
	 List<Shoppingmall> selection();
}
