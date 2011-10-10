/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.tutorial.stateless.client;

import org.jboss.tutorial.stateless.bean.Calculator;
import org.jboss.tutorial.stateless.bean.CalculatorRemote;

import javax.naming.InitialContext;

public class Client
{
   public static void main(String[] args) throws Exception
   {
      sleep(5);

      InitialContext ctx = new InitialContext();
      Calculator calculator = (Calculator) ctx.lookup("Calculator/remote");

      System.out.println("1 + 1 = " + calculator.add(1, 1));

      System.out.println("!!! You can also kill the selected Jboss instance !!!");
      sleep(10);

      System.out.println("1 - 1 = " + calculator.subtract(1, 1));
   }

   public static void sleep(int i) throws Exception 
   {
   	for(; i!=0;i--) 
        {
   	   	System.out.println( i+" s");
   		Thread.sleep(1000);
      	}
   }
}
