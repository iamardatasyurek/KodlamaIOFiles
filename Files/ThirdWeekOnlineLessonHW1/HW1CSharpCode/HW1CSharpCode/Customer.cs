using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW1CSharpCode
{
    public class Customer
    {
        public int Id { get; set; }
        
        public string City { get; set; }

        public Customer(int Id, string City)
        {
            Console.WriteLine("Customer is created with properties.");
            this.Id = Id;
            this.City = City;
        }
        public Customer()
        {
            Console.WriteLine("Customer is created without properties.");
        }
    }
}
