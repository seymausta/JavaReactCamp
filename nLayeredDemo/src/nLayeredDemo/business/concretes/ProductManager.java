package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	// data access'e gevþek baðýmlýsýn, abstractýna
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//Ýþ kodlarý yazýlýr
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return; //23.10 bir izle
		} 
		this.productDao.add(product);
		
		this.loggerService.logToSystem(" Ürün eklendi : "+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
