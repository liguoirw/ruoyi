import request from '@/utils/request'

// 查询tupian列表
export function listCeshi1(query) {
  return request({
    url: '/system/ceshi1/list',
    method: 'get',
    params: query
  })
}

// 查询tupian详细
export function getCeshi1(id) {
  return request({
    url: '/system/ceshi1/' + id,
    method: 'get'
  })
}

// 新增tupian
export function addCeshi1(data) {
  return request({
    url: '/system/ceshi1',
    method: 'post',
    data: data
  })
}

// 修改tupian
export function updateCeshi1(data) {
  return request({
    url: '/system/ceshi1',
    method: 'put',
    data: data
  })
}

// 删除tupian
export function delCeshi1(id) {
  return request({
    url: '/system/ceshi1/' + id,
    method: 'delete'
  })
}
