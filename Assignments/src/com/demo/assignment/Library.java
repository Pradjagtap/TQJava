package com.demo.assignment;

/* Task2: Create a library of books , Count the number of books added in the library. All the books have a common supplier "Mr XYZ" 
Show the details of library as:
Supplier name:
Total books:
Book details
*/
class Library {
		private int bid;
		private static int count;
		private String bname;
		private String books;
		static String supplier_name="Mr. XYZ";
		{
			count++;
		}
		Library(){
			System.out.println("Supplier name is Mr. XYZ");
		}

		Library(int bid,String bname,String books){
			this.bid=bid;
			this.bname=bname;
			this.books = books;
			//this.count = count;
		}
		
		public void setId(int bid) {
			this.bid = bid;
		}

		public int getId() {
			return bid;
		}

		public void setName(String bname) {
			this.bname = bname;
		}

		public String getName() {
			return bname;
		}
		public void setBooks(String books) {
			this.books = books;
		}

		public String getBooks() {
			return books;
		}

		
		
		public String toString() {
			return "Book:" + bid + "Book Name " + bname+"Book type "+books+"count of books"+count;
		}

	}

