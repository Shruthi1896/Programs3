package com.red.org;


	import javax.persistence.Entity;
	import javax.persistence.Id;
    import javax.persistence.OneToMany;
	@Entity
	public class Books {

		  @Id  
			private int book_id;
			private String book_name;
			public int getBook_id() {
				return book_id;
			}
			public void setBook_id(int book_id) {
				this.book_id = book_id;
			}
			public String getBook_name() {
				return book_name;
			}
			public void setBook_name(String book_name) {
				this.book_name = book_name;
			}
		  
	


}
