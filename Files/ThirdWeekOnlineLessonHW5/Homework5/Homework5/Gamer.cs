using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework5
{
    public class Gamer
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public int BirthYear { get; set; }
        public long IdentityNumber { get; set; }

        public Gamer(int id, string firstName, string lastName, int birthYear, long identityNumber)
        {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
            BirthYear = birthYear;
            IdentityNumber = identityNumber;
        }
    }
}
