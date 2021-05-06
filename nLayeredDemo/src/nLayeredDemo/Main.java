package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//entityler hari� newliyorsan ileride problem ya�ayacaks�n
		
		//ToDo: Spring IoC ile iyile�tirilecek
		//interface                         manager  (interface new'lemedik)
		ProductService productService= new ProductManager(new AbcProductDao(),
				 new JLoggerManagerAdapter());
		
		
		Product product= new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
