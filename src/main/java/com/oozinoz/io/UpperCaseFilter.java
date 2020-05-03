package com.oozinoz.io;

import java.io.*;

/*
 * Copyright (c) 2001 Steven J. Metsker.
 * 
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose, 
 * including the implied warranty of merchantability.
 *
 * Please use this software as you wish with the sole
 * restriction that you may not claim that you wrote it.
 */
/**
 * Make all characters upper case.
 * 
 * @author Steven J. Metsker
 */
public class UpperCaseFilter extends OozinozFilter 
{
/**
 * Construct a filter that pass upper case characters
 * to the supplied stream.
 *
 * @param out a writer to which to pass down writes 
 */
public UpperCaseFilter(Writer out)
{
	super(out);
}
/**
 * Pass an upper case version of the supplied character
 * to the underlying stream.
 *
 * @param c the character to write
 *
 * @throws IOException if an I/O error occurs
 */
public void write(int c) throws IOException 
{
	out.write(Character.toUpperCase((char) c));
}
}