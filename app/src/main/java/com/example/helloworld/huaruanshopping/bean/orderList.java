package com.example.helloworld.huaruanshopping.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helloworld on 2017/3/18.
 */

public class orderList {


    /**
     * message : success
     * data : [{"id":"1487779951358","name":"爱爱","phone":"13524623151","remark":"加辣，超级辣的那种","total":432,"address":"潮州","status":{},"sorderSet":[{"id":63,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":62,"price":63,"number":3,"protype":{"id":2,"name":"海鲜味","pic":"/img/2.jpg","inventory":76,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]},{"id":"1487779792136","name":"海俊","phone":"123124325235","remark":"加两双筷子","total":1052,"address":"清风阁","status":{},"sorderSet":[{"id":61,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":60,"price":63,"number":3,"protype":{"id":2,"name":"海鲜味","pic":"/img/2.jpg","inventory":76,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]},{"id":"1489667063525","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":70,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}},{"id":71,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}}]},{"id":"1489667069256","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":73,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}},{"id":72,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}}]},{"id":"1489667230733","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":75,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":74,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]},{"id":"1489667044127","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":66,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}},{"id":67,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}}]},{"id":"1489667057173","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":69,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":68,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]},{"id":"1489666966595","name":"sysho","phone":"123124325235","remark":"加两双筷子","total":1058,"address":"清风阁","status":{},"sorderSet":[{"id":64,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":65,"price":69,"number":3,"protype":{"id":3,"name":"烧烤味","pic":"/img/3.jpg","inventory":100,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]}]
     * error_code : 0
     */
    @SerializedName("message")
    private String message;
    @SerializedName("error_code")
    private String error_code;
    @SerializedName("data")
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Parcelable{
        /**
         * id : 1487779951358
         * name : 爱爱
         * phone : 13524623151
         * remark : 加辣，超级辣的那种
         * total : 432.0
         * address : 潮州
         * status : {}
         * sorderSet : [{"id":63,"price":989,"number":43,"protype":{"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}},{"id":62,"price":63,"number":3,"protype":{"id":2,"name":"海鲜味","pic":"/img/2.jpg","inventory":76,"product":{"id":1,"name":"1康师傅大方便面","price":22,"remark":"康师傅 大食代红烧牛肉面 124g*5/袋 方便面泡面","sales":0}}}]
         */
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("phone")
        private String phone;
        @SerializedName("remark")
        private String remark;
        @SerializedName("total")
        private double total;
        @SerializedName("address")
        private String address;
        @SerializedName("status")
        private StatusBean status;
        @SerializedName("sorderSet")
        private List<SorderSetBean> sorderSet;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public StatusBean getStatus() {
            return status;
        }

        public void setStatus(StatusBean status) {
            this.status = status;
        }

        public List<SorderSetBean> getSorderSet() {
            return sorderSet;
        }

        public void setSorderSet(List<SorderSetBean> sorderSet) {
            this.sorderSet = sorderSet;
        }

        public static class StatusBean implements Parcelable{
            @SerializedName("id")
            private int id;
            @SerializedName("status")
            private String status;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeString(this.status);
            }

            public StatusBean() {
            }

            protected StatusBean(Parcel in) {
                this.id = in.readInt();
                this.status = in.readString();
            }

            public static final Creator<StatusBean> CREATOR = new Creator<StatusBean>() {
                @Override
                public StatusBean createFromParcel(Parcel source) {
                    return new StatusBean(source);
                }

                @Override
                public StatusBean[] newArray(int size) {
                    return new StatusBean[size];
                }
            };
        }

        public static class SorderSetBean implements Parcelable{
            /**
             * id : 63
             * price : 989.0
             * number : 43
             * protype : {"id":4,"name":"芥末味","pic":"/img/4.jpg","inventory":260,"product":{"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}}
             */
            @SerializedName("id")
            private int id;
            @SerializedName("price")
            private double price;
            @SerializedName("number")
            private int number;
            @SerializedName("comm_flag")
            private int comm_flag;

            @SerializedName("protype")
            private ProtypeBean protype;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getComm_flag() {
                return comm_flag;
            }

            public void setComm_flag(int comm_flag) {
                this.comm_flag = comm_flag;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public ProtypeBean getProtype() {
                return protype;
            }

            public void setProtype(ProtypeBean protype) {
                this.protype = protype;
            }

            public static class ProtypeBean implements Parcelable{
                /**
                 * id : 4
                 * name : 芥末味
                 * pic : /img/4.jpg
                 * inventory : 260
                 * product : {"id":2,"name":"小乐事薯片","price":23,"remark":"乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包","sales":10}
                 */
                @SerializedName("id")
                private int id;
                @SerializedName("name")
                private String name;
                @SerializedName("pic")
                private String pic;
                @SerializedName("inventory")
                private int inventory;
                @SerializedName("product")
                private ProductBean product;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public int getInventory() {
                    return inventory;
                }

                public void setInventory(int inventory) {
                    this.inventory = inventory;
                }

                public ProductBean getProduct() {
                    return product;
                }

                public void setProduct(ProductBean product) {
                    this.product = product;
                }

                public static class ProductBean implements Parcelable{
                    /**
                     * id : 2
                     * name : 小乐事薯片
                     * price : 23.0
                     * remark : 乐事薯片40g*10包组合整箱办公室休闲膨化零食品送女友批发大礼包
                     * sales : 10
                     */
                    @SerializedName("id")
                    private int id;
                    @SerializedName("name")
                    private String name;
                    @SerializedName("price")
                    private double price;
                    @SerializedName("remark")
                    private String remark;
                    @SerializedName("sales")
                    private int sales;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getRemark() {
                        return remark;
                    }

                    public void setRemark(String remark) {
                        this.remark = remark;
                    }

                    public int getSales() {
                        return sales;
                    }

                    public void setSales(int sales) {
                        this.sales = sales;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeInt(this.id);
                        dest.writeString(this.name);
                        dest.writeDouble(this.price);
                        dest.writeString(this.remark);
                        dest.writeInt(this.sales);
                    }

                    public ProductBean() {
                    }

                    protected ProductBean(Parcel in) {
                        this.id = in.readInt();
                        this.name = in.readString();
                        this.price = in.readDouble();
                        this.remark = in.readString();
                        this.sales = in.readInt();
                    }

                    public static final Creator<ProductBean> CREATOR = new Creator<ProductBean>() {
                        @Override
                        public ProductBean createFromParcel(Parcel source) {
                            return new ProductBean(source);
                        }

                        @Override
                        public ProductBean[] newArray(int size) {
                            return new ProductBean[size];
                        }
                    };
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.id);
                    dest.writeString(this.name);
                    dest.writeString(this.pic);
                    dest.writeInt(this.inventory);
                    dest.writeParcelable(this.product, flags);
                }

                public ProtypeBean() {
                }

                protected ProtypeBean(Parcel in) {
                    this.id = in.readInt();
                    this.name = in.readString();
                    this.pic = in.readString();
                    this.inventory = in.readInt();
                    this.product = in.readParcelable(ProductBean.class.getClassLoader());
                }

                public static final Creator<ProtypeBean> CREATOR = new Creator<ProtypeBean>() {
                    @Override
                    public ProtypeBean createFromParcel(Parcel source) {
                        return new ProtypeBean(source);
                    }

                    @Override
                    public ProtypeBean[] newArray(int size) {
                        return new ProtypeBean[size];
                    }
                };
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.id);
                dest.writeDouble(this.price);
                dest.writeInt(this.number);
                dest.writeInt(this.comm_flag);
                dest.writeParcelable(this.protype, flags);
            }

            public SorderSetBean() {
            }

            protected SorderSetBean(Parcel in) {
                this.id = in.readInt();
                this.price = in.readDouble();
                this.number = in.readInt();
                this.comm_flag = in.readInt();
                this.protype = in.readParcelable(ProtypeBean.class.getClassLoader());
            }

            public static final Creator<SorderSetBean> CREATOR = new Creator<SorderSetBean>() {
                @Override
                public SorderSetBean createFromParcel(Parcel source) {
                    return new SorderSetBean(source);
                }

                @Override
                public SorderSetBean[] newArray(int size) {
                    return new SorderSetBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.phone);
            dest.writeString(this.remark);
            dest.writeDouble(this.total);
            dest.writeString(this.address);
            dest.writeParcelable(this.status, flags);
            dest.writeList(this.sorderSet);
        }

        public DataBean() {
        }

        protected DataBean(Parcel in) {
            this.id = in.readString();
            this.name = in.readString();
            this.phone = in.readString();
            this.remark = in.readString();
            this.total = in.readDouble();
            this.address = in.readString();
            this.status = in.readParcelable(StatusBean.class.getClassLoader());
            this.sorderSet = new ArrayList<SorderSetBean>();
            in.readList(this.sorderSet, SorderSetBean.class.getClassLoader());
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }
}
