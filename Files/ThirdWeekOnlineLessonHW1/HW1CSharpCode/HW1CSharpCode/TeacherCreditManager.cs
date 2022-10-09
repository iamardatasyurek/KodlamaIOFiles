using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW1CSharpCode
{
    public class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Teacher Credit is calculated.");
        }

        public override void Save()
        {
            base.Save();
        }
    }
}
