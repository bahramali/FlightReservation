package flight_model;

import airline_model.City;

public class CityToCity{
		private City city1;
		private City city2;
		private double price;
		
		public CityToCity(City city1, City city2,double price)
		{
			this.city1 = city1;
			this.city2 = city2;
			this.price= price;
		}
		
		public City getCity1()
		{
			return city1;
		}
		public void setCity1(City city1)
		{
			this.city1 = city1;
		}
		public City getCity2()
		{
			return city2;
		}
		public void setCity2(City city2)
		{
			this.city2 = city2;
		}
		
		public double getPrice()
		{
			return price;
		}

		public void setPrice(double price)
		{
			this.price = price;
		}

		@Override
		public String toString()
		{
			return city1+" "+city2+String.format("%5.2f",price);
		}
		
	}