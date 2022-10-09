using System;

namespace HW1CSharpCode
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //CustomerDemo();
            CreditDemo();

        }
        static void CustomerDemo()
        {
            CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer();
            customer.Id = 1;
            customer.City = "New York City";
            //CustomerManager customerManager = new CustomerManager(customer);
            //customerManager.Save();
            //customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "123123123";
            company.CompanyName = "Tesla";
            company.Id = 100;
            customer.City = "Los Angeles";
            //CustomerManager customerManager1 = new CustomerManager(company);
            //customerManager1.Save();
            //customerManager1.Delete();

            Person person = new Person();
            person.FirstName = "John";
            person.LastName = "Wick";
            person.NationalIdentity = "12345";
            person.Id = 2;
            person.City = "London";
            //CustomerManager customerManager2 = new CustomerManager(person);
            //customerManager2.Save();
            //customerManager2.Delete();

            Customer c1 = new Customer();
            Customer c2 = new Person();
            Customer c3 = new Company();
        }
        static void CreditDemo()
        {
            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager.GiveCredit();
        }
    }
}
