﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework5
{
    public interface IUserValidationService
    {
        bool Validate(Gamer gamer);
    }
}
