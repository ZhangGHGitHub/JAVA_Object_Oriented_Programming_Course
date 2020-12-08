package niit.edu.cn.java1007;
/**
 * @author:张国豪
 * Date: 2020/10/7 12:45
 * FileName: Stock
 * Description: 9.2
 */
public class    Stock {
    /**@param股票代码*/
    private String symbol;
    /**@param股票名字*/
    private String name;
    /**@param前一日的股票值*/
    double previousClosingPrice;
    /** @param 当前股票值*/
    double currentPrice;
    public Stock()
    {
        symbol="股票代码123";
        name="股票名称123";
    }
    public Stock(String symbol,String name,double previousClosingPrice,double currentPrice)
    {
        this.symbol=symbol;
        this.name=name;
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;
    }
    public double getChangePercent()
    {
        return (previousClosingPrice-currentPrice)/previousClosingPrice*100;
       //return (Math.max(previousClosingPrice, currentPrice) - Math.min(previousClosingPrice, currentPrice))/previousClosingPrice*100;
    }

    public static void main(String[] args) {
        Stock s = new Stock("123321","Apple",35,35.5);
        System.out.println("股票代码："+ s.symbol);
        System.out.println("股票名称:"+s.name);
        System.out.println("前一日股票值:"+s.previousClosingPrice);
        System.out.println("今日股票值:"+s.currentPrice);
        System.out.println("股票值变化百分比："+s.getChangePercent()+"%");
    }
}

