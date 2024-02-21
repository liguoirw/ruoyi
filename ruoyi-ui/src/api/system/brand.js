import request from '@/utils/request'

// 查询品牌型号列表
export function listBrand(query) {
  return request({
    url: '/system/brand/list',
    method: 'get',
    params: query
  })
}

// 查询品牌型号详细
export function getBrand(brandId) {
  return request({
    url: '/system/brand/' + brandId,
    method: 'get'
  })
}

// 新增品牌型号
export function addBrand(data) {
  return request({
    url: '/system/brand',
    method: 'post',
    data: data
  })
}

// 修改品牌型号
export function updateBrand(data) {
  return request({
    url: '/system/brand',
    method: 'put',
    data: data
  })
}

// 删除品牌型号
export function delBrand(brandId) {
  return request({
    url: '/system/brand/' + brandId,
    method: 'delete'
  })
}
