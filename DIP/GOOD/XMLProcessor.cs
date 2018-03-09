using System;
using System.Diagnostics;

namespace DIP.GOOD
{
    public class XMLProcessor
    {
        public IXMLSource xml { get; set; }

        public XMLProcessor(IXMLSource xml)
        {
            this.xml = xml;
        }

        public void Process()
        {
            var data = this.xml.data;
            // Traiter le XML
        }
    }
}