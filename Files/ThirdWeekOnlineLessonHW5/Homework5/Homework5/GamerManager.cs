using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework5
{
    public class GamerManager : IGamerService
    {
        private IUserValidationService _userValidationService;

        public GamerManager(IUserValidationService userValidationService)
        {
            _userValidationService = userValidationService;
        }

        public void Add(Gamer gamer)
        {
            if(_userValidationService.Validate(gamer))
                Console.WriteLine("Gamer is added : " + gamer.FirstName+" "+gamer.LastName);
            else
                Console.WriteLine("Validation and registration has been failed...");
        }

        public void Delete(Gamer gamer)
        {
            if (_userValidationService.Validate(gamer))
                Console.WriteLine("Gamer is deleted : " + gamer.FirstName + " " + gamer.LastName);
            else
                Console.WriteLine("Validation and deletion has been failed...");
        }

        public void Update(Gamer gamer)
        {
            if (_userValidationService.Validate(gamer))
                Console.WriteLine("Gamer is updated : " + gamer.FirstName + " " + gamer.LastName);
            else
                Console.WriteLine("Validation and updation has been failed...");
        }
    }
}
