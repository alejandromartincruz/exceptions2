/*
 * Copyright 2014 Alejandro Martin Cruz
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.upc.eetac.dsa.amartin.exceptions2;

import java.io.File;
import java.util.Scanner;


class BigNumberException extends Exception {
	
	public BigNumberException () {
		
	}
	
	public BigNumberException (String message) {
		super(message);
	}
	
	public String getMessage () {
		return "Número mayor o igual a 1000 " + super.getMessage();
	}
}

public class App 
{
    public static void main( String[] args )
    {
		System.out.println( "Ejercicio 1: Exceptions");
		System.out.println( "=========================\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print ("Escribe la ruta del archivo: ");
		String dato = sc.nextLine();
	
		File F;
		Scanner sc2 = null;
		try {
			F = new File(dato);
			sc2 = new Scanner(F);
			while (sc2.hasNext()) {
			    int xx = sc2.nextInt();
			    if (xx>=1000) throw new BigNumberException("Error");
			    System.out.println(xx);
			}
		}
		catch (Exception ex) {
			System.out.println ("Excepcion no esperada: " + ex);
		}	
		finally {
			sc2.close();
		}
		
		
	}
}
