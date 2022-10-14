using System;

namespace Homework5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Gamer gamer1 = new Gamer(1,"John","Wick",1985,123123123);
            GamerManager gamerManager = new GamerManager(new NewEStateUserValidationManager());
            gamerManager.Add(gamer1);
        }
    }
}
