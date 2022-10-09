using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW1CSharpCode
{
    public abstract class BaseCreditManager
    {
        public abstract void Calculate();
        public virtual void Save()
        {
            Console.WriteLine("Credit is saved.");
        }
    }
}
