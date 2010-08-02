package org.jrimum.utilix;

import java.util.Collection;
import java.util.Map;

/**
 * <p>
 * Classe utilitária para validações de coleções em geral, com e sem exceções.
 * </p>
 * 
 * <p>
 * Fornece métodos booleanos e métodos que verificam se uma coleção está de acordo
 * com o desejado e, caso não estejam, lançam exceção.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public final class Collections {
	
	/**
	 * Utility class pattern: classe não instanciável
	 * 
	 * @throws AssertionError caso haja alguma tentativa de utilização deste construtor.
	 */
	private Collections() {
		
		throw new AssertionError("NOT SUPORTED OPERATION!");
	}

	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passada por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos e lança exceção caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param collection - Instância de <code>Collection</code> analisada
	 * 
	 * @thows IllegalArgumentException - Caso a coleção <strong>não</strong> seja <code>null</code> e possua elementos.
	 * 
	 * @see #checkEmpty(Collection, String)
	 * @see #isEmpty(Collection)
	 * @see #isNotEmpty(Collection)
	 * 
	 * @since 0.2
	 */
	public static void checkEmpty(Collection<?> collection) {
		
		checkEmpty(collection, "Collection não nulo e com elementos! Valor [" + collection + "].");
	}
	
	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passado por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos e lança exceção, com a mensagem informada, 
	 * caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param collection - Instância de <code>Collection</code> analisada
	 * @param message - Mensagem utilizada na exceção
	 * 
	 * @thows IllegalArgumentException - Caso a coleção <strong>não</strong> seja <code>null</code> e possua elementos.
	 * 
	 * @see #isEmpty(Collection)
	 * @see #isNotEmpty(Collection)
	 * 
	 * @since 0.2
	 */
	public static void checkEmpty(Collection<?> collection, String message) {
		
		if(hasElement(collection)){
			
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passada por parâmetro <strong>não</strong> é <code>null</code> e 
	 * possui elementos e lança exceção caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param map - Instância de <code>Collection</code> analisada
	 * 
	 * @throws NullPointerException - Caso a coleção seja <code>null</code>.
	 * @thows IllegalArgumentException - Caso a coleção <strong>não</strong> possua elementos.
	 * 
	 * @see #checkNotEmpty(Collection, String)
	 * @see #isEmpty(Collection)
	 * @see #isNotEmpty(Collection)
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Collection<?> collection) {
		
		checkNotEmpty(collection, "Objeto nulo!", "Collection sem elementos!");
	}
	
	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passada por parâmetro <strong>não</strong> é <code>null</code> e 
	 * possui elementos e lança exceção, com a mensagem informada, caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param collection - Instância de <code>Collection</code> analisada
	 * @param message - Mensagem utiliada na exceção
	 * 
	 * @throws NullPointerException - Caso a coleção seja <code>null</code>.
	 * @thows IllegalArgumentException - Caso a coleção <strong>não</strong> possua elementos.
	 * 
	 * @see #isEmpty(Collection)
	 * @see #isNotEmpty(Collection)
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Collection<?> collection, String message) {
		
		checkNotEmpty(collection, message, message);
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos e lança exceção caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * 
	 * @thows IllegalArgumentException - Caso o mapa <strong>não</strong> seja <code>null</code> e possua elementos.
	 * 
	 * @see #checkEmpty(Map, String)
	 * @see #isEmpty(Map)
	 * @see #isNotEmpty(Map)
	 * 
	 * @since 0.2
	 */
	public static void checkEmpty(Map<?, ?> map) {
		
		checkEmpty(map, "Map não nulo e com elementos. Valor [" + map + "]");
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos e lança exceção, com a mensagem informada, 
	 * caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * @param message - Mensagem utilizada na exceção
	 * 
	 * @thows IllegalArgumentException - Caso o mapa <strong>não</strong> seja <code>null</code> e possua elementos.
	 * 
	 * @see #isEmpty(Map)
	 * @see #isNotEmpty(Map)
	 * 
	 * @since 0.2
	 */
	public static void checkEmpty(Map<?, ?> map, String message) {
		
		if(hasElement(map)){
			
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro <strong>não</strong> é <code>null</code> e 
	 * possui elementos e lança exceção caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * 
	 * @throws NullPointerException - Caso o mapa seja <code>null</code>.
	 * @thows IllegalArgumentException - Caso o mapa <strong>não</strong> possua elementos.
	 * 
	 * @see #checkNotEmpty(Map, String)
	 * @see #isEmpty(Map)
	 * @see #isNotEmpty(Map)
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Map<?, ?> map) {
		
		checkNotEmpty(map, "Objeto nulo", "Map sem elementos");
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro <strong>não</strong> é <code>null</code> e 
	 * possui elementos e lança exceção, com a mensagem informada, caso não preencha estes requisitos.
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * @param message - Mensagem utiliada na exceção
	 * 
	 * @throws NullPointerException - Caso o mapa seja <code>null</code>.
	 * @thows IllegalArgumentException - Caso o mapa <strong>não</strong> possua elementos.
	 * 
	 * @see #isEmpty(Map)
	 * @see #isNotEmpty(Map)
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Map<?, ?> map, String message) {
		
		checkNotEmpty(map, message, message);
	}
	
	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passada por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos. 
	 * </p>
	 * 
	 * @param collection - Instância de <code>Collection</code> analisada
	 * @return <code>!hasElement(collection)</code>
	 * 
	 * @since 0.2
	 */
	public static boolean isEmpty(Collection<?> collection) {
		
		return  !hasElement(collection);
	}
	
	/**
	 * <p>
	 * Verifica se a <code>Collection</code> passada por parâmetro <strong>não</strong> é <code>null</code> 
	 * e possui elementos. 
	 * </p>
	 * 
	 * @param collection - Instância de <code>Collection</code> analisada
	 * @return <code>hasElement(collection)</code>
	 * 
	 * @see #isEmpty(Collection)
	 * 
	 * @since 0.2
	 */
	public static boolean isNotEmpty(Collection<?> collection) {
		
		return  hasElement(collection);
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro é <code>null</code> ou 
	 * <strong>não</strong> possui elementos. 
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * @return <code>!hasElement(map)</code>
	 * 
	 * @since 0.2
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		
		return  !hasElement(map);
	}
	
	/**
	 * <p>
	 * Verifica se o <code>Map</code> passado por parâmetro <strong>não</strong> é <code>null</code> 
	 * e possui elementos. 
	 * </p>
	 * 
	 * @param map - Instância de <code>Map</code> analisada
	 * @return <code>hasElement(map)</code>
	 * 
	 * @see #isEmpty(Map)
	 * 
	 * @since 0.2
	 */
	public static boolean isNotEmpty(Map<?, ?> map) {
		
		return hasElement(map);
	}
	
	/**
	 * <p>
	 * Indica se uma dada coleção tem elementos sem gerar NPE.
	 * </p>
	 * <p>
	 * Resposta direata para o seguinte código:
	 * <code>(c != null && !c.isEmpty())</code>.
	 * </p>
	 * 
	 * @param c
	 *            - A coleção a ser testada.
	 * 
	 * @return (c != null && !c.isEmpty())
	 * 
	 * @since 0.2
	 */
	public static boolean hasElement(Collection<?> c) {

		return (c != null && !c.isEmpty());
	}

	/**
	 * <p>
	 * Indica se um dado mapa tem elementos sem gerar NPE.
	 * </p>
	 * <p>
	 * Resposta direata para o seguinte código:
	 * <code>(m != null && !m.isEmpty())</code>.
	 * </p>
	 * 
	 * @param m
	 *            - O mapa a ser testado.
	 * 
	 * @return (m != null && !m.isEmpty())
	 * 
	 * @since 0.2
	 */
	public static boolean hasElement(Map<?, ?> m) {

		return (m != null && !m.isEmpty());
	}
	
	/**
	 * <p>
	 * Verifica se o coleção passado por parâmetro <strong>não</strong> é <code>null</code> ou se é vazio.
	 * </p>
	 * <p>
	 * Caso o objeto seja <code>null</code>, lança <code>NullPointerException</code> com a mensagem informada no
	 * parâmetro <code>messageNullPointer</code> (primeiro parâmetro String). Caso o objeto não seja 
	 * <code>null</code> e não possua elementos, lança <code>IllegalArgumentException</code> com a mensagem 
	 * informada no parâmetro <code>messageIllegalArgument</code> (segundo parâmetro String).
	 * </p>
	 * 
	 * @param collection - Objeto analisado
	 * @param messageNullPointer - Mensagem utiliada na exceção <code>NullPointerException</code>
	 * @param messageIllegalArgument - Mensagem utiliada na exceção <code>IllegalArgumentException</code>
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Collection<?> collection, String messageNullPointer, String messageIllegalArgument) {
		
		if (collection == null) {
			
			throw new NullPointerException(messageNullPointer);
		}
		
		if (collection.isEmpty()) {
			
			throw new IllegalArgumentException(messageIllegalArgument);
		} 
	}
	
	/**
	 * <p>
	 * Verifica se o mapa passado por parâmetro <strong>não</strong> é <code>null</code> ou se é vazio.
	 * </p>
	 * <p>
	 * Caso o objeto seja <code>null</code>, lança <code>NullPointerException</code> com a mensagem informada no
	 * parâmetro <code>messageNullPointer</code> (primeiro parâmetro String). Caso o objeto não seja 
	 * <code>null</code> e não possua elementos, lança <code>IllegalArgumentException</code> com a mensagem 
	 * informada no parâmetro <code>messageIllegalArgument</code> (segundo parâmetro String).
	 * </p>
	 * 
	 * @param map - Objeto analisado
	 * @param messageNullPointer - Mensagem utiliada na exceção <code>NullPointerException</code>
	 * @param messageIllegalArgument - Mensagem utiliada na exceção <code>IllegalArgumentException</code>
	 * 
	 * @since 0.2
	 */
	public static void checkNotEmpty(Map<?,?> map, String messageNullPointer, String messageIllegalArgument) {
		
		if (map == null) {
			
			throw new NullPointerException(messageNullPointer);
		}
		
		if (map.isEmpty()) {
			
			throw new IllegalArgumentException(messageIllegalArgument);
		} 
	}
	
}