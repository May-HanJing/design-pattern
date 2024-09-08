package edu.ncu.structure.adapter;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface OrderMapper {

    @Mappings({
    @Mapping(target = "orderCode",source = "jddjOrderCode"),
    @Mapping(target = "storeCode",source = "jddjStoreCode"),
    @Mapping(target = "skuCode",source = "jddjSkuCode"),
    @Mapping(target = "price",source = "jddjPrice"),
    @Mapping(target = "createTime",source = "jddjCreateTime"),
    @Mapping(target = "skuName",source = "jddjSkuName")})
    Order convertJddjOrder(JddjOrder jddjOrder);


    @Mappings({
            @Mapping(target = "skuCode",source = "meituanSkuCode"),
            @Mapping(target = "skuName",source = "meituanSkuName"),
            @Mapping(target = "price",source = "meituanPrice"),
            @Mapping(target = "createTime",source = "meituanCreateTime") ,
            @Mapping(target = "storeCode",source = "meituanStoreCode"),
            @Mapping(target = "orderCode",source = "meituanOrderCode")
    })
    Order convertMeituanOrder(MeituanOrder meituanOrder);
}
