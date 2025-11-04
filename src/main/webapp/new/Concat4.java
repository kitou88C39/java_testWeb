private String str1 = null;
private String str2 = null;
private ConcatResult result = null;

public void join() {

    //文字列の結合
    String result = str1 + str2;

    //結果クラスに結合結果をセット
    result = new ConcatResult();
    result.setResult(answer);

    public ConcatResult getResult() {
        return result;
    }

    public void setStr1(String value) {
        str1 = value;
    }

    public void setStr2(String value) {
        str2 = value;
    
    }
}
