package edu.cuanschutz.ccp.mn_paper_baseline;

/*-
 * #%L
 * Colorado Computational Pharmacology's CRAFT Shared
 * 						Task Baseline Utility
 * 						project
 * %%
 * Copyright (C) 2020 Regents of the University of Colorado
 * %%
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * 3. Neither the name of the Regents of the University of Colorado nor the names of its contributors
 *    may be used to endorse or promote products derived from this software without
 *    specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import edu.cuanschutz.ccp.mn_paper_baseline.BaselineFileGenerator;
import edu.cuanschutz.ccp.mn_paper_baseline.BaselineFileGenerator.Input;
import edu.cuanschutz.ccp.mn_paper_baseline.BaselineFileGenerator.Ontology;

public class BaselineFileGeneratorTest {

	@Test
	public void testGetInputFileCore() {
		File dataDirectory = new File("/home/baseline/data");
		File inputFile = BaselineFileGenerator.getInputFile(dataDirectory, Input.CORE, Ontology.CHEBI);
		File expectedInputFile = new File("/home/baseline/data/input/core/gs_CHEBI_combo_src_file.txt");
		
		assertEquals(expectedInputFile, inputFile);
	}
	
	@Test
	public void testGetInputFileExt() {
		File dataDirectory = new File("/home/baseline/data");
		File inputFile = BaselineFileGenerator.getInputFile(dataDirectory, Input.EXT, Ontology.CHEBI);
		File expectedInputFile = new File("/home/baseline/data/input/ext/gs_CHEBI_EXT_combo_src_file.txt");
		
		assertEquals(expectedInputFile, inputFile);
	}

}