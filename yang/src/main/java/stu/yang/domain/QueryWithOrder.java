package stu.yang.domain;


public class QueryWithOrder extends Query {
    private String sidx;
    private String sord;

    public QueryWithOrder() {
    }

    public QueryWithOrder(int pageIndex, int pageSize) {
        super(pageIndex, pageSize);
    }

    public String getSidx() {
        return this.sidx;
    }

    public String getSidxColumn() {
        return this.underscoreName(this.sidx);
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return this.sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String underscoreName(String name) {
        StringBuilder result = new StringBuilder();
        if (name != null && name.length() > 0) {
            result.append(name.substring(0, 1));

            for(int i = 1; i < name.length(); ++i) {
                String s = name.substring(i, i + 1);
                if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
                    result.append("_");
                }

                result.append(s.toLowerCase());
            }
        }

        return result.toString();
    }
}

