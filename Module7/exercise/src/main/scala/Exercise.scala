import org.apache.spark._
import org.apache.spark.SparkContext._
import utils.TweetUtils
import utils.TweetUtils._
object Exercise {
    def main(args: Array[String]) {
          val inputFile = args(0)
          val outputFile = args(1)
          val conf = new SparkConf().setAppName("exercise application")
          // Create a Scala Spark Context.
          val sc = new SparkContext(conf)
          val input = sc.textFile(inputFile).mapPartitions(TweetUtils.parseFromJson(_))

          // To do


     }
}
