﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SRP
{
    class User
    {

        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime BirthDay { get; set; }
        public Guid UserId { get; set; }

        public void Insert()
        { }

        public void Update()
        { }


        public bool IsValid()
        {
            bool isValid=false;


            return isValid;
        }


        public int GetAge()
        {
            int age = 0;


            return age;
        }




    }
}
