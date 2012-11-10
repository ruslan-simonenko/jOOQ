package org.jooq.xtend

import java.io.File
import java.io.FileWriter
import java.io.IOException

abstract class Generators {
	
    def write(String className, CharSequence contents) {
        val file = new File("./../jOOQ/src/main/java/" + className.replace(".", "/") + ".java");
        file.getParentFile().mkdirs();
    
        try {
            System::out.println("Generating " + file);
            val fw = new FileWriter(file);
            fw.append(contents);
            fw.flush();
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    def first(int degree) {
        switch degree {
            case 1 : "first"
            case 2 : "second"
            case 3 : "third"
            case 4 : "fourth"
            case 5 : "fifth"
            case 6 : "sixth"
            case 7 : "seventh"
            case 8 : "eighth"
            case 9 : "ninth"
            case 10 : "tenth"
            case 11 : "eleventh"
            case 12 : "twelfth"
            case 13 : "thirteenth"
            case 14 : "fourteenth"
            case 15 : "fifteenth"
            case 16 : "sixteenth"
            case 17 : "seventeenth"
            case 18 : "eighteenth"
            case 19 : "ninteenth"
            case 20 : "twentieth"
            case 21 : "twenty-first"
            case 22 : "twenty-second"
            case degree % 10 == 1 : degree + "st"
            case degree % 10 == 2 : degree + "nd"
            case degree % 10 == 3 : degree + "rd"
            default : degree + "th"
        }
    }
    
    def classHeader() {
        '''
        /**
         * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
         * All rights reserved.
         *
         * This software is licensed to you under the Apache License, Version 2.0
         * (the "License"); You may obtain a copy of the License at
         *
         *   http://www.apache.org/licenses/LICENSE-2.0
         *
         * Redistribution and use in source and binary forms, with or without
         * modification, are permitted provided that the following conditions are met:
         *
         * . Redistributions of source code must retain the above copyright notice, this
         *   list of conditions and the following disclaimer.
         *
         * . Redistributions in binary form must reproduce the above copyright notice,
         *   this list of conditions and the following disclaimer in the documentation
         *   and/or other materials provided with the distribution.
         *
         * . Neither the name "jOOQ" nor the names of its contributors may be
         *   used to endorse or promote products derived from this software without
         *   specific prior written permission.
         *
         * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
         * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
         * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
         * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
         * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
         * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
         * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
         * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
         * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
         * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
         * POSSIBILITY OF SUCH DAMAGE.
         */
        '''
    }
    
    def generatedAnnotation() {
        '''
        @Generated("This class was generated using jOOQ-tools")
        '''
    }
    
    def TN(int degree) {
        // A comma-separated list of types T1, T2, .., TN
        (1..degree).join(", ", [e | "T" + e])
    }
    
       def tn(int degree) {
        // A comma-separated list of types T1, T2, .., TN
        (1..degree).join(", ", [e | "t" + e])
    }
    
    def TN_tn(int degree) {
        // A comma-separated list of arguments T1 t1, T2 t2, .., TN tn
        (1..degree).join(", ", [e | "T" + e + " t" + e])
    }
    
    def Field_TN_tn(int degree) {
        (1..degree).join(", ", [e | "Field<T" + e + "> t" + e])
    }
    
	
}