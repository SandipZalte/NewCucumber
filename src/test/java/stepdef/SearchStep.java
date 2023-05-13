package stepdef;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchStep  {
	Product product;
	Search search;
	
	@Given("I have search field in amazon page")
	public void i_have_search_field_in_amazon_page() {
		System.out.println("Step 1: I am step 1");
	
	}

	@When("I search the product with Name {string} and Price {int}")
	public void i_search_the_product_with_name_and_price(String prodcutName, Integer price) {
		System.out.println("Step 2 : i am a step 2 -->"+ prodcutName  +"Price-->"  +price);
		product = new Product(prodcutName,price);
	
	}

	@Then("Product  with Name {string} should be Displayed")
	public void productWithNameShouldBeDisplayed(String productName){
		System.out.println("Step 3 : i am a step 3-->"+ productName  +"Displayed");
		search = new Search();
		String proName=search.displayProduct(product);
	Assert.assertEquals(product.getProdcutName(), proName);
	}


	

}
