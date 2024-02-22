package Easy

/** Será passado uma array de inteiros e um valor alvo. A ideia é que retornemos o index de 2
números da array que, somados, retorme o valor do alvo. Não podemos passar duas vezes o mesmo index
Podemos assumir que cada input terá apenas 1 solução possível.
 Tanto os números no array quanto o target podem ser negativos.
 **/

fun twoSum(nums: IntArray, target: Int): IntArray {
 val map = mutableMapOf<Int, Int>()
 for (i in nums.indices) {
  val complement = target - nums[i]
  if (map.containsKey(complement)) {
   return intArrayOf(map[complement]!!, i)
  }
  map[nums[i]] = i
 }
 return intArrayOf()
}

/** A solução acima funciona bem. Ela faz um for limitado ao tamanho da array. Na primeira iteração, o if sempre dará
 * falso, pois a variável "map" ainda não foi preenchida.
 * Note que ela é preenchida sempre com o valor atual do it, assim, guardando toda a lista de valores que já foram passados.
 * Após, para cada nova iteração, verificamos se o valor atual menos a target resulta em algum valor que já foi passado
 * e está armazenado no "map", se sim (condição do if), é retornado esse valor e o if. Se não, o valor atual é adicionado
 * em "map" e seguimos o loop até encontrar.
 */