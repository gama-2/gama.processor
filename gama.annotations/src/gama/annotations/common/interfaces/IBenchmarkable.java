/*******************************************************************************************************
 *
 * IBenchmarkable.java, in ummisco.gama.annotations, is part of the source code of the
 * GAMA modeling and simulation platform (v.1.9.0).
 *
 * (c) 2007-2022 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 * 
 ********************************************************************************************************/
package gama.annotations.common.interfaces;

/**
 * Represents objects that can be used in benchmarking operations (see {@link gama.core.runtime.benchmark.Benchmark})
 * 
 * @author drogoul
 * @since July 2018
 *
 */

public interface IBenchmarkable {

	/**
	 * Returns a human-readable name for benchmark results
	 * 
	 * @return a string representing this object in benchmark results
	 */
	public String getNameForBenchmarks();

}
