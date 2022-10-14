using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework5
{
    internal class UserValidationManager : IUserValidationService
    {
        public bool Validate(Gamer gamer)
        {
            if(gamer.BirthYear == 1985 && gamer.FirstName == "John" && gamer.LastName == "Wick")
            {
                return true;
            }
            else return false;
        }
    }
}
