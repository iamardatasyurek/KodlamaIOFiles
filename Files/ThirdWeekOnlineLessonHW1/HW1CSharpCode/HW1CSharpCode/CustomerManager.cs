using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW1CSharpCode
{
    public class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }

        public void Save()
        {
            Console.WriteLine($"Customer is saved : {_customer.Id}");
        }

        public void Delete()
        {
            Console.WriteLine($"Customer is deleted : {_customer.Id}");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Credit is given");
        }
    }
}
