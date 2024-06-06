package com.custom;

public class InvalidRangeException extends RuntimeException{
			
		private static final long serailVersionUID=1L;
		
		public InvalidRangeException() {
			super();
		}
		
		public InvalidRangeException(String message)
		{
			super(message);
		}

}
