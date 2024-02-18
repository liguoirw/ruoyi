import request from '@/utils/request'

// 查询信用卡申请大数据评估系统列表
export function listWenjuandiaocha(query) {
  return request({
    url: '/system/wenjuandiaocha/list',
    method: 'get',
    params: query
  })
}

// 查询信用卡申请大数据评估系统详细
export function getWenjuandiaocha(id) {
  return request({
    url: '/system/wenjuandiaocha/' + id,
    method: 'get'
  })
}

// 新增信用卡申请大数据评估系统
export function addWenjuandiaocha(data) {
  return request({
    url: '/system/wenjuandiaocha',
    method: 'post',
    data: data
  })
}

// 修改信用卡申请大数据评估系统
export function updateWenjuandiaocha(data) {
  return request({
    url: '/system/wenjuandiaocha',
    method: 'put',
    data: data
  })
}

// 删除信用卡申请大数据评估系统
export function delWenjuandiaocha(id) {
  return request({
    url: '/system/wenjuandiaocha/' + id,
    method: 'delete'
  })
}
